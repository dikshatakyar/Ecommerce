package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;

import java.io.IOException;
import java.util.List;

public interface IProductsOfCategoryService {
    List<FakeStoreProductsOfCategoryResponseDTO> getAllProductsOfCategory() throws IOException;
}
