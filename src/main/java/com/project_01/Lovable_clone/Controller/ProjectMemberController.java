package com.project_01.Lovable_clone.Controller;


import com.project_01.Lovable_clone.DTO.member.InviteMemberRequest;
import com.project_01.Lovable_clone.DTO.member.MemberResponse;
import com.project_01.Lovable_clone.DTO.member.UpdateMemberRoleRequest;
import com.project_01.Lovable_clone.Services.ProjectMemberService;
import com.project_01.Lovable_clone.entity.ProjectMember;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/me")
@RequiredArgsConstructor
public class ProjectMemberController {
//    contructor dependency injection , @requieredargsconst creates constructor for variavle having final
    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMember(@PathVariable Long projectId)
    {
        Long userId=1L;
        return ResponseEntity.ok(projectMemberService.getprojectMembers(projectId,userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectId,
            @RequestBody UpdateMemberRoleRequest request
    )
    {
        Long userId=1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(projectId,request,userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody InviteMemberRequest request
    )
    {
        Long userId=1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId,memberId,userId));
    }
    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    )
    {
        Long userId=1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId,memberId,userId));
    }


}
