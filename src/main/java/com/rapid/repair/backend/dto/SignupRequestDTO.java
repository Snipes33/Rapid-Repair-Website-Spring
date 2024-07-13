package com.rapid.repair.backend.dto;

import com.rapid.repair.backend.enums.UserRole;
import lombok.Data;

@Data
public class SignupRequestDTO {
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;
    private UserRole role;
}
