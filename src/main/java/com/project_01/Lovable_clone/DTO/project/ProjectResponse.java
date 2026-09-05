package com.project_01.Lovable_clone.DTO.project;

import com.project_01.Lovable_clone.DTO.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
