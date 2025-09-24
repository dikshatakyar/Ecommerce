package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.dto.ProductWithCategoryDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException;
    ProductDTO getProductDetails(long id) throws Exception;
    ProductDTO createProduct(ProductDTO dto) throws Exception;
    ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception;

}
