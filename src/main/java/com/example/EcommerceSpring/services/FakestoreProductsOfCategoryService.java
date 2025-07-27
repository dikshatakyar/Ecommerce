package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;
import com.example.EcommerceSpring.gateway.IProductsOfCategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreProductsOfCategoryService implements IProductsOfCategoryService {

    private final IProductsOfCategoryGateway productsOfCategoryGateway;

    FakestoreProductsOfCategoryService(IProductsOfCategoryGateway productsOfCategoryGateway){
        this.productsOfCategoryGateway = productsOfCategoryGateway;
    }

    @Override
    public List<FakeStoreProductsOfCategoryResponseDTO> getAllProductsOfCategory() throws IOException {
        return this.productsOfCategoryGateway.getAllProductsOfCategory();
    }
}
