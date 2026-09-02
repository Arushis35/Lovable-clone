package com.project_01.Lovable_clone.entity;

import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Subscription {
    Long id;

    User user;
    Plan plan;
    String stripeCustomerId;
    String strpeSubscriptionId;

    SubscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd=false;


    Instant createdAt;
    Instant updatedAt;
}
