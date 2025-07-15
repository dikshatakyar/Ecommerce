package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.services.FakestoreCategoryService;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    CategoryController(ICategoryService categoryService){
        this.categoryService = categoryService; //dependency injection
    }

    @GetMapping
    public List<String> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

}
