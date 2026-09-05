package com.project_01.Lovable_clone.DTO.auth;


//record makes this class immutable
public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}

//dummy: new AuthResponse("",new UserProfilResponse());