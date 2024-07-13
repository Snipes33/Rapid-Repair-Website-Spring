package com.rapid.repair.backend.services.authentication;

import com.rapid.repair.backend.dto.SignupRequestDTO;
import com.rapid.repair.backend.dto.UserDto;

public interface AuthService {
    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);

    boolean presentByEmail(String email);
}