package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {
    List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException;
    FakeStoreProductResponseDTO getProductDetails(int id) throws IOException;
}
