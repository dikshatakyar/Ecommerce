package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface FakeStoreProductsApi {
    @GET("products/category/{categoryName}")
    Call<List<FakeStoreProductResponseDTO>> getAllProductsOfCategory(@Path("categoryName") String categoryName);
}
