package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.CategoryWithAllProductsDTO;
import com.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    public FakestoreCategoryService(@Qualifier("fakeStoreRestTemplateGateway") ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto){
        return null;
    }

    @Override
    public  CategoryDTO getByName(String name) throws Exception{
        return null;
    }

    @Override
    public CategoryWithAllProductsDTO getAllProductsOfCategory(Long id) throws Exception{
        return null;
    }

}
