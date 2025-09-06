package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.web.client.RestTemplate;

public class FakeStoreRestTemplateApi {
    private final RestTemplate restTemplate;

    public FakeStoreRestTemplateApi(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public FakeStoreCategoryResponseDTO getAllFakeCategories(){
        String baseUrl = System.getProperty("fakestoreBaseUrl");
        return restTemplate.getForObject(baseUrl + "products/category", FakeStoreCategoryResponseDTO.class);
    }
}
