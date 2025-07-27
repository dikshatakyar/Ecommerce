package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;
import com.example.EcommerceSpring.services.IProductsOfCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/products/category")
public class ProductsOfCategoryController {
    private final IProductsOfCategoryService productsOfCategoryService;

    public ProductsOfCategoryController(IProductsOfCategoryService productsOfCategoryService){
        this.productsOfCategoryService = productsOfCategoryService;
    }

    @GetMapping("/{categoryName}")
    public List<FakeStoreProductsOfCategoryResponseDTO> getAllProductsOfCategories() throws IOException {
        return this.productsOfCategoryService.getAllProductsOfCategory();
    }
}
