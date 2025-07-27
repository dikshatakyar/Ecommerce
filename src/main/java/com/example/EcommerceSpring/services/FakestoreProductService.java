package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreProductService implements IProductService {

    private final IProductGateway productsOfCategoryGateway;

    FakestoreProductService(IProductGateway productsOfCategoryGateway){
        this.productsOfCategoryGateway = productsOfCategoryGateway;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        return this.productsOfCategoryGateway.getAllProductsOfCategory(category);
    }
}
