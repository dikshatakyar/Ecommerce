package org.example.ecommercespring.mapper;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toDTO(Category entity){
        return CategoryDTO.builder().id(entity.getId()).name(entity.getName()).build();
    }

    public static Category toEntity(CategoryDTO dto){
        return Category.builder().name(dto.getName()).build();
    }
}
