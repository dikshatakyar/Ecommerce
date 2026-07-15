package org.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
	private String image;
	private Object price;
	private String description;
	private Long id;
	private String title;
	private Long categoryId;
}