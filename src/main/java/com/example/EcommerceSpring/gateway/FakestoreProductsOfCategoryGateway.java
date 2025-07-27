package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductsofCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakestoreProductsOfCategoryGateway  implements  IProductsOfCategoryGateway{

    private final FakeStoreProductsofCategoryApi fakeStoreProductsofCategoryApi;

    FakestoreProductsOfCategoryGateway(FakeStoreProductsofCategoryApi fakeStoreProductsofCategoryApi){
        this.fakeStoreProductsofCategoryApi = fakeStoreProductsofCategoryApi;
    }

    @Override
    public List<FakeStoreProductsOfCategoryResponseDTO> getAllProductsOfCategory() throws IOException {
        List<FakeStoreProductsOfCategoryResponseDTO> response = this.fakeStoreProductsofCategoryApi.getAllProductsOfCategory("electronics").execute().body();

        if(response == null){
            throw new IOException("Fetch failed");
        }

        return response;

    }
}
