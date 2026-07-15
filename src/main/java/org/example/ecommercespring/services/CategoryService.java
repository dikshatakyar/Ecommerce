package org.example.ecommercespring.services;

import lombok.AllArgsConstructor;
import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.entity.Category;
import org.example.ecommercespring.mapper.CategoryMapper;
import org.example.ecommercespring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService implements ICategoryService {

        private final CategoryRepository repo;


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
       List<CategoryDTO> dto = new ArrayList<>();
       for(Category category: repo.findAll()){
           dto.add(CategoryMapper.toDTO(category));
       }
       return dto;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = CategoryMapper.toEntity(categoryDTO);
        Category savedCategory = repo.save(category);
        return CategoryMapper.toDTO(savedCategory);
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        Category category = repo.findByName(name).orElseThrow(() -> new Exception("Category not found"));
        return CategoryMapper.toDTO(category);
    }
}
