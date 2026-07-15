package org.example.ecommercespring.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.entity.Category;
import org.example.ecommercespring.entity.Product;
import org.example.ecommercespring.exception.ProductNotFoundException;
import org.example.ecommercespring.mapper.ProductMapper;
import org.example.ecommercespring.repository.CategoryRepository;
import org.example.ecommercespring.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) throws Exception {
        Category category = categoryRepository.findById(dto.getCategoryId()).orElseThrow(() -> new Exception("Category not found"));
        Product saved = productRepository.save(ProductMapper.toEntity(dto, category));
        return ProductMapper.toDto(saved);
    }

}
