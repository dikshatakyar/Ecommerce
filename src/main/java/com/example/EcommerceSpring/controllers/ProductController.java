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
@RequestMapping("/api/products/category")
public class ProductController {
    private final IProductService productsOfCategoryService;

    public ProductController(IProductService productsOfCategoryService){
        this.productsOfCategoryService = productsOfCategoryService;
    }

    @GetMapping("/{categoryName}")
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategories(@PathVariable String categoryName) throws IOException {
        return this.productsOfCategoryService.getAllProductsOfCategory(categoryName);
    }
}
