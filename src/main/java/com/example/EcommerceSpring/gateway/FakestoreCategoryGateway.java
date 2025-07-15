package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class FakestoreCategoryGateway implements ICategoryGateway{
    @Override
    public CategoryDTO getAllCategories(){
        return null;
    }
}
