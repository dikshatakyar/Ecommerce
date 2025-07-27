package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreProductsOfCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface FakeStoreProductsofCategoryApi {
    @GET("products/category/{categoryName}")
    Call<List<FakeStoreProductsOfCategoryResponseDTO>> getAllProductsOfCategory(@Path("categoryName") String categoryName);
}
