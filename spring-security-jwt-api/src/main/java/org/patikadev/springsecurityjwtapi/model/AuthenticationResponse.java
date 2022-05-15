package org.patikadev.springsecurityjwtapi.model;

import java.util.Set;


public record AuthenticationResponse(String token, Set<String> roles) {

}
