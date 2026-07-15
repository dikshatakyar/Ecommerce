package org.example.ecommercespring.gateway.api;

import org.example.ecommercespring.dto.ProductDTO;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Path;


public interface FakeStoreProductApi {
    @GET("products/{id}/")
    Call<ProductDTO> getFakeProduct(@Path("id") Long id);
}
