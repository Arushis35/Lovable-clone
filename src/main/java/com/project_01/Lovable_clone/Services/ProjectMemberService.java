package com.project_01.Lovable_clone.Services;

import com.project_01.Lovable_clone.DTO.member.MemberResponse;
import com.project_01.Lovable_clone.DTO.member.UpdateMemberRoleRequest;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    @Nullable List<MemberResponse> getprojectMembers(Long projectId, Long userId);

    @Nullable MemberResponse inviteMember(Long projectId, UpdateMemberRoleRequest request, Long userId);

    @Nullable MemberResponse updateMemberRole(Long projectId, Long memberId, Long userId);

    @Nullable MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
