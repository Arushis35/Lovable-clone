package com.project_01.Lovable_clone.DTO.subscription;

public record PlanLimitsResponse(
        String planName,
        Integer maxTokensPerDay,
        Integer maxProjects,
        boolean unlimitedAi
) {
}
