package com.project_01.Lovable_clone.DT0_AUTH;


//record makes this class immutable
public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}

//dummy: new AuthResponse("",new UserProfilResponse());