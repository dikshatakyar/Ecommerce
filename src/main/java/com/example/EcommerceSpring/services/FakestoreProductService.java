package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
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
    public FakeStoreProductResponseDTO getProductDetails(int id) throws IOException{
        return this.productGateway.getProductDetails(id);
    }
}
