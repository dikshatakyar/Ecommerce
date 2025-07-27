package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @GetMapping("/category/{categoryName}")
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategories(@PathVariable String categoryName) throws IOException {
        return this.productService.getAllProductsOfCategory(categoryName);
    }

    @GetMapping("/{id}")
    public FakeStoreProductResponseDTO getProductDetails(@PathVariable int id) throws IOException{
        return this.productService.getProductDetails(id); //to get single product details
    }
}
