package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("okHttpProductGateway")
public class OkHttpProductGateway implements  IProductGateway{

    private final OkHttpClient okHttpClient;

    public OkHttpProductGateway(OkHttpClient okHttpClient){
        this.okHttpClient = okHttpClient;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProductsOfCategory(String category) throws IOException {
        return List.of();
    }

    @Override
    public ProductDTO getProductDetails(long id) throws IOException {
        Request request = new Request.Builder().url("https://fakestoreapi.com/products/" + id).build();

        try(Response response = okHttpClient.newCall(request).execute()){
            if(!response.isSuccessful()){
                throw new IOException("Failed");
            }
            String json = response.body().string();
            Gson gson = new Gson();
            return gson.fromJson(json, ProductDTO.class);
        }
    }
}
