package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.project.FileContentResponse;
import com.project_01.Lovable_clone.DTO.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    @Nullable List<FileNode> getFileTree(Long projectId, Long userId);

    @Nullable FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
