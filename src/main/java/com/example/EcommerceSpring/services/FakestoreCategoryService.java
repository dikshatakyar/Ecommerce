package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakestoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    public FakestoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<String> getAllCategories(){
        return List.of();
    }

}
