package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.entity.Category;
import com.example.EcommerceSpring.mappers.CategoryMapper;
import com.example.EcommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    CategoryService(CategoryRepository categoryRepository){
         this.categoryRepository = categoryRepository;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException{
        return categoryRepository.findAll()
                .stream()
                .map(CategoryMapper::toDto)
                .toList();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO dto){
        Category newCategory = categoryRepository.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(newCategory);
    }

}
