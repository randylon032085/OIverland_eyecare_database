package com.dylan.view.utilmapper;

import com.dylan.view.dto.roles.request.RoleCreateRequest;
import com.dylan.view.dto.roles.response.RolesResponse;
import com.dylan.view.model.Roles;

public class RolesMapper {

    public static RolesResponse toDto(Roles roles){
        if(roles == null) return  null;
        
        return new RolesResponse(
            roles.getName()

           
        );
    }

   public static Roles toEntity(RoleCreateRequest roleCreateRequest){
        if(roleCreateRequest == null) return null;

        Roles roles = new Roles();

        roles.setName(roleCreateRequest.getName());

        return roles;
   }
    
}
