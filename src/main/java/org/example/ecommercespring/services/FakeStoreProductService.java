package org.example.ecommercespring.services;

import lombok.RequiredArgsConstructor;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public ProductDTO getProductById(Long id) {
        return this.productGateway.getProductById(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO product) {
        return null;
    }

}