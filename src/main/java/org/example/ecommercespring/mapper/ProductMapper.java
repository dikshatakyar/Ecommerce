package org.example.ecommercespring.mapper;

import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.entity.Category;
import org.example.ecommercespring.entity.Product;

public class ProductMapper {

    public static ProductDTO toDto(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .image(product.getImage())
                .price(product.getPrice())
                .title(product.getTitle())
                .categoryId(product.getCategory().getId())
                .description(product.getDescription())
                .build();
    }


        public static Product toEntity(ProductDTO productDTO, Category category){
            return Product.builder()
                    .image(productDTO.getImage())
                    .price((int) productDTO.getPrice())
                    .title(productDTO.getTitle())
                    .category(category)
                    .description(productDTO.getDescription())
                    .build();
        }

}
