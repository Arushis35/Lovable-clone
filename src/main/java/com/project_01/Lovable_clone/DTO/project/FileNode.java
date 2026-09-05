package com.project_01.Lovable_clone.DTO.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiesAt,
        Long size,
        String type
) {
}
