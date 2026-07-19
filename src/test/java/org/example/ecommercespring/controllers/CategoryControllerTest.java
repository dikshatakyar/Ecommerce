package org.example.ecommercespring.controllers;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.exception.GlobalExceptionHandler;
import org.example.ecommercespring.services.ICategoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class CategoryControllerTest {


    @Mock
    private ICategoryService categoryService;

    @InjectMocks
    private CategoryController categoryController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(categoryController)
                        .setControllerAdvice(new GlobalExceptionHandler())
                        .build();
    }

    @Test
    void getAllCategories_shouldReturnALlCategories() throws Exception {

        //Arrange
        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(CategoryDTO.builder().name("Dresses").id(1L).build());
        categories.add(CategoryDTO.builder().name("Slippers").id(2L).build());

        when(categoryService.getAllCategories()).thenReturn(categories);

        //act
        mockMvc.perform(get("/api/categories").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].name").value("Dresses"))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].name").value("Slippers"));

        //assert
        verify(categoryService, times(1)).getAllCategories();

    }

}
