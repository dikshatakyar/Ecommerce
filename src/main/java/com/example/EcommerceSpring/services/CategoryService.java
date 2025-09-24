package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.CategoryWithAllProductsDTO;
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

    @Override
    public  CategoryDTO getByName(String name) throws Exception{
        Category category = categoryRepository.findByName(name)
                .orElseThrow(() -> new Exception("Category not found with name " + name));

        return CategoryMapper.toDto(category);
    }

    @Override
    public CategoryWithAllProductsDTO getAllProductsOfCategory(Long id) throws Exception{
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new Exception("Category does not exists"));
        CategoryWithAllProductsDTO dto = CategoryMapper.toCategoryWithAllProductsDto(category);
        return dto;
    }

}
