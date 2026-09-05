package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.auth.AuthResponse;
import com.project_01.Lovable_clone.DTO.auth.LoginRequest;
import com.project_01.Lovable_clone.DTO.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    @Nullable AuthResponse signup(SignupRequest request);

    @Nullable AuthResponse login(LoginRequest request);
}
