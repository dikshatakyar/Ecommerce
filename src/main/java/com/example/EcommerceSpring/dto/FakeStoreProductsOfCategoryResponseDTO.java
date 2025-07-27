package com.example.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductsOfCategoryResponseDTO {
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private RatingDTO rating;

}
