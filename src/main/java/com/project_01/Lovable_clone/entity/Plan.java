package com.project_01.Lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
    Long id;
    String stripePriceId;
    Integer maxProducts;
    Integer maxTokensPerDay;
    Integer maxPreviews;
    Boolean unlimitedAi;

    Boolean active;
}
