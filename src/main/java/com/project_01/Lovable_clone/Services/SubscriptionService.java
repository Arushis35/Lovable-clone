package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.subscription.CheckoutRequest;
import com.project_01.Lovable_clone.DTO.subscription.CheckoutResponse;
import com.project_01.Lovable_clone.DTO.subscription.PortalResponse;
import com.project_01.Lovable_clone.DTO.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    @Nullable SubscriptionResponse getCurrentSubscription(Long userId);

    @Nullable CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    @Nullable PortalResponse openCustomerPortal(Long userId);
}
