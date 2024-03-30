package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.enums.UserRole;

public record RegisterDto(String name, String password, UserRole role, String email, String date) {
}
