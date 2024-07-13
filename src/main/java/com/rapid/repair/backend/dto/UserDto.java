package com.rapid.repair.backend.dto;

import com.rapid.repair.backend.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole role;
}
