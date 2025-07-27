package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductDetailsApi;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductsApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("FakestoreProductGateway")
public class FakestoreProductGateway implements IProductGateway {

    private final FakeStoreProductsApi fakeStoreProductsApi;
    private final FakeStoreProductDetailsApi fakeStoreProductDetailsApi;

    FakestoreProductGateway(FakeStoreProductsApi fakeStoreProductsApi, FakeStoreProductDetailsApi fakeStoreProductDetailsApi){
        this.fakeStoreProductsApi = fakeStoreProductsApi;
        this.fakeStoreProductDetailsApi = fakeStoreProductDetailsApi;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        List<FakeStoreProductResponseDTO> response = this.fakeStoreProductsApi.getAllProductsOfCategory(category).execute().body();

        if(response == null){
            throw new IOException("Fetch failed");
        }

        return response;

    }

    @Override
    public FakeStoreProductResponseDTO getProductDetails(int id) throws IOException {
       FakeStoreProductResponseDTO response = fakeStoreProductDetailsApi.getProductDetails(id).execute().body();

       if(response == null){
           throw new IOException("API failed");
       }

       return response;
    }
}
