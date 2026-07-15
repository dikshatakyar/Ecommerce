package org.example.ecommercespring.gateway;

import lombok.RequiredArgsConstructor;
import org.example.ecommercespring.dto.ProductDTO;
import org.example.ecommercespring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    public ProductDTO getProductById(Long id){

        try {
            ProductDTO response = fakeStoreProductApi.getFakeProduct(id).execute().body();
            return response;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
