package com.project_01.Lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class User {
    Long id;
    String email;
    String password_hash;
    String name;
    String avatar_url;
    Instant createdAt;
    Instant updated_At;
    Instant deletedAt;// soft delete
}
