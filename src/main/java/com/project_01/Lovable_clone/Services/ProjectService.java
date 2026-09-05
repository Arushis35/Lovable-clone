package com.project_01.Lovable_clone.Services;


import com.project_01.Lovable_clone.DTO.project.ProjectRequest;
import com.project_01.Lovable_clone.DTO.project.ProjectResponse;
import com.project_01.Lovable_clone.DTO.project.ProjectSummaryResponse;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface ProjectService {
    @Nullable List<ProjectSummaryResponse> getUserProjects(Long userId);

    @Nullable ProjectResponse getUserProjectById(Long id, Long userId);

    @Nullable ProjectResponse createProject(ProjectRequest request, Long userId);

    @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
