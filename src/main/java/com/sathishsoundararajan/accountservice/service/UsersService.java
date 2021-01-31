package com.sathishsoundararajan.accountservice.service;

import com.sathishsoundararajan.accountservice.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

    UserDto createUser(UserDto userDetails);

    UserDto getUserDetailsByEmail(String email);

}
