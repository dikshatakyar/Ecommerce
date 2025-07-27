package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;

import java.io.IOException;
import java.util.List;

public interface IProductsOfCategoryGateway {
    List<FakeStoreProductsOfCategoryResponseDTO> getAllProductsOfCategory() throws IOException;
}
