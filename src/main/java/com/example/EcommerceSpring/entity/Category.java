package com.example.EcommerceSpring.entity;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {
    private String name;
}
