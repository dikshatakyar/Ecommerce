package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    public FakestoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

}
