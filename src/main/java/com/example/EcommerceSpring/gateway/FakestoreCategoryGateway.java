package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakestoreCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakestoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // 1. Make the HTTP request to the FakeStore API to fetch all categories
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();


        // 2. Check if the response is null and throw an IOException if it is
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        // 3. Map the response to a list of CategoryDTO objects
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
