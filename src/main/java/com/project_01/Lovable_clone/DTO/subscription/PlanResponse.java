package com.project_01.Lovable_clone.DTO.subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProducts,
        Integer maxTokensPerDay,
        Boolean unlimitedAi,
        String price
) {
}
