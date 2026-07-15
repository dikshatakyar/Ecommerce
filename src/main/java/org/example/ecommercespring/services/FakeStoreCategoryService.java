package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {
    private final ICategoryGateway categoryGateway;

    FakeStoreCategoryService(@Qualifier("fakeStoreRestTemplate") ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        return null;
    }

}
