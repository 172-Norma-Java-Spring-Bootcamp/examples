package org.patikadev.springsecurityjwtapi.security;

import lombok.RequiredArgsConstructor;
import org.patikadev.springsecurityjwtapi.entity.User;
import org.patikadev.springsecurityjwtapi.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
        return new UserDetail(user.getUsername(), user.getPassword(), user.getRoles(), user.getUserStatus());
    }
}
