package org.example.ecommercespring.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.exception.ProductNotFoundException;
import org.example.ecommercespring.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping("/{id}")
    ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception {
        ProductDTO result = productService.getProductById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO request) throws  Exception{
        return ResponseEntity.ok(productService.createProduct(request));
    }

}
