package com.example.EcommerceSpring.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDTO {
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private Long id;
    private String title;
    private Long categoryId;
    private String brand;
    private boolean popular;
    private CategoryDTO category;
}
