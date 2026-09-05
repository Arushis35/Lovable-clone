package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    @Nullable List<PlanResponse> getAllActivePlans();
}
