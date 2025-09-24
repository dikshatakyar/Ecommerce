package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.CategoryWithAllProductsDTO;
import com.example.EcommerceSpring.services.FakestoreCategoryService;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController{

    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService){
        this.categoryService = categoryService; //dependency injection
    }

    @GetMapping
    public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {
        if(name != null &&  !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }
        List<CategoryDTO> result = this.categoryService.getAllCategories();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO){
        CategoryDTO newCategory = this.categoryService.createCategory(categoryDTO);
        return ResponseEntity.ok(newCategory);
    }

    @GetMapping("{id}/products")
    public ResponseEntity<CategoryWithAllProductsDTO> getAllProductsOfCategory(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(categoryService.getAllProductsOfCategory(id));
    }
}
