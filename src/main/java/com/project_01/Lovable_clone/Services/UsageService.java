package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.subscription.PlanLimitsResponse;
import com.project_01.Lovable_clone.DTO.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {

    @Nullable UsageTodayResponse getTodayUsageOfUser(Long userId);

    @Nullable PlanLimitsResponse getCurrentSubscriptionPlanOfUser(Long userId);
}
