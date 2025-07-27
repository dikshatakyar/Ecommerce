package com.example.EcommerceSpring.configuration;

import com.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductsApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Configuration
public class RetrofitConfig {



    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder().baseUrl(System.getProperty("fakestoreBaseUrl")).addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Bean
    public Retrofit retrofit2(){
        return new Retrofit.Builder().baseUrl(System.getProperty("fakeStoreProductsOfCategory")).addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductsApi fakeStoreProductsofCategoryApi(Retrofit retrofit2){
        return retrofit2.create(FakeStoreProductsApi.class);
    }
}
