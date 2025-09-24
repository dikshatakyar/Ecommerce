package com.example.EcommerceSpring.dto;

import com.example.EcommerceSpring.entity.Product;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryWithAllProductsDTO {
    private String name;
    private Long id;
    private List<ProductDTO> products;
}
