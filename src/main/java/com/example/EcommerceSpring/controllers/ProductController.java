package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.example.EcommerceSpring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ProductDTO getProductDetails(@PathVariable long id) throws Exception{
        return this.productService.getProductDetails(id); //to get single product details
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) throws Exception{
        return ResponseEntity.ok(productService.createProduct(dto));
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(productService.getProductWithCategory(id));
    }

}
