package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.entity.Product;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {
    List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException;
    ProductDTO getProductDetails(long id) throws IOException;
}
