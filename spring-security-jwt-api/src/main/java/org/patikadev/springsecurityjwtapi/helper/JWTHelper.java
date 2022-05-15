package org.patikadev.springsecurityjwtapi.helper;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.Instant;
import java.util.Date;

@Component
@Getter
@Setter
@Slf4j
public class JWTHelper {

    @Value("${ssja.jwt.secret-key}")
    private String secretKey;
    @Value("${ssja.jwt.expires-in}")
    private long expiresIn;

    public String generate(String username) {
        if (!StringUtils.hasLength(username)) {
            throw new IllegalArgumentException("Username can not be null or empty");
        }
        return JWT.create()
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(Date.from(Instant.now()).getTime() + expiresIn))
                .withClaim("username", username)
                .sign(Algorithm.HMAC512(secretKey));
    }

    public String findUsername(String token) {
        if (!StringUtils.hasLength(token)) {
            throw new IllegalArgumentException("Token can not be null or empty");
        }
        return JWT.decode(token).getClaim("username").asString();
    }

    public boolean validate(String token) {
        try {
            JWT.require(Algorithm.HMAC512(secretKey))
                    .build()
                    .verify(token);
            return true;
        } catch (AlgorithmMismatchException algorithmMismatchException) {
            log.error("JWT Token AlgorithmMismatchException occurred!");
        } catch (SignatureVerificationException signatureVerificationException) {
            log.error("JWT Token SignatureVerificationException occurred!");
        } catch (TokenExpiredException tokenExpiredException) {
            log.error("JWT Token TokenExpiredException occurred!");
        } catch (InvalidClaimException invalidClaimException) {
            log.error("JWT Token InvalidClaimException occurred!");
        }
        return false;
    }
}
