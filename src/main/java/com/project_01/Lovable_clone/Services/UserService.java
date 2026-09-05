package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
