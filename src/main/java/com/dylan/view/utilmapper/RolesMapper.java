package com.dylan.view.utilmapper;

import com.dylan.view.dto.roles.response.RolesResponse;
import com.dylan.view.model.Roles;

public class RolesMapper {

    public static RolesResponse toDto(Roles roles){
        if(roles == null) return  null;
        
        return new RolesResponse(
            roles.getName()

           
        );
    }
    
}
