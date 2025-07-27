package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException;
    FakeStoreProductResponseDTO getProductDetails(int id) throws IOException;
}
