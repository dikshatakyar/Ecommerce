package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreProductDetailsApi {
    @GET("products/{id}")
    Call<ProductDTO> getProductDetails(@Path("id") long id);
}
