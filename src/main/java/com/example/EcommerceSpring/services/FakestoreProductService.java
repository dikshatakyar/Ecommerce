package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.example.EcommerceSpring.gateway.IProductGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreProductService implements IProductService {

    private final IProductGateway productGateway;

    FakestoreProductService(@Qualifier("okHttpProductGateway") IProductGateway productGateway){
        this.productGateway = productGateway;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        return this.productGateway.getAllProductsOfCategory(category);
    }

    @Override
    public ProductDTO getProductDetails(long id) throws IOException{
        return this.productGateway.getProductDetails(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        return null;
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception{
        return null;
    }

}
