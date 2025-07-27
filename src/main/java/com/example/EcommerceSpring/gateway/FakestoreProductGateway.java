package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductsApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakestoreProductGateway implements IProductGateway {

    private final FakeStoreProductsApi fakeStoreProductsApi;

    FakestoreProductGateway(FakeStoreProductsApi fakeStoreProductsApi){
        this.fakeStoreProductsApi = fakeStoreProductsApi;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        List<FakeStoreProductResponseDTO> response = this.fakeStoreProductsApi.getAllProductsOfCategory(category).execute().body();

        if(response == null){
            throw new IOException("Fetch failed");
        }

        return response;

    }
}
