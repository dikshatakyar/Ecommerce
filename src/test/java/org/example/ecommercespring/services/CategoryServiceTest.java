package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.entity.Category;
import org.example.ecommercespring.repository.CategoryRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryService categoryService;


    //every test needs to be represented in the form of function
    @Test
    @DisplayName("getAllCategories should return all categories")
    void getAllCategories_shouldReturnAllCategories(){

        //arrange
        List<Category> categories = new ArrayList<>();
        Category category1 = Category.builder().name("Shoes").build();
        Category category2 = Category.builder().name("Clothes").build();
        category1.setId(1L);
        category2.setId(2L);
        categories.add(category1);
        categories.add(category2);

        when(categoryRepository.findAll()).thenReturn(categories);

        //act
        List<CategoryDTO> result = categoryService.getAllCategories();

        //assert (verify)
        assertEquals(result.size(), 2);
        verify(categoryRepository, times(1)).findAll();

    }
}
