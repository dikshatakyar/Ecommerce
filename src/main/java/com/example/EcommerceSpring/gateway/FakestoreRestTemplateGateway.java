package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreRestTemplateApi;
import com.example.EcommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreRestTemplateGateway")
public class FakestoreRestTemplateGateway implements ICategoryGateway{

    private final FakeStoreRestTemplateApi fakeStoreRestTemplateApi;

    public FakestoreRestTemplateGateway(FakeStoreRestTemplateApi fakeStoreRestTemplateApi){
        this.fakeStoreRestTemplateApi = fakeStoreRestTemplateApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = fakeStoreRestTemplateApi.getAllFakeCategories();

        return GetAllCategoriesMapper.toCategoryDTO(response);
    }
}
