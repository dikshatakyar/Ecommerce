package com.example.EcommerceSpring.configuration;

import com.example.EcommerceSpring.gateway.api.FakeStoreRestTemplateApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public FakeStoreRestTemplateApi fakeStoreRestTemplateApi(RestTemplate restTemplate){
        return new FakeStoreRestTemplateApi(restTemplate);
    }
}
