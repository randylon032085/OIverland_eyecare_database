package com.dylan.view.utilmapper;

import com.dylan.view.dto.category.response.CategoryResponse;
import com.dylan.view.model.Category;

public class CategoryMapper {

    public static CategoryResponse toDto(Category category){
        if(category == null)return null;
        return new CategoryResponse(
            category.getName()
        );
    }
    
}
