package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreProductDetailsApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getProductDetails(@Path("id") int id);
}
