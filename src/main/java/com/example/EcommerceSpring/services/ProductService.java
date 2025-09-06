package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService implements  IProductService{
    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        return List.of();
    }

    @Override
    public FakeStoreProductResponseDTO getProductDetails(int id) throws IOException {
        return null;
    }
}
