package com.example.EcommerceSpring.entity;

import com.example.EcommerceSpring.dto.RatingDTO;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity{
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
