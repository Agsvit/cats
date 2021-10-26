package com.example.backendshelter.provider;

import com.example.backendshelter.controller.request.Response.FactResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class FactProvider {
    private final RestTemplate restTemplate;

    public String getFact() {
        final var response = restTemplate.getForEntity("http://localhost:8081/fact", String.class);
        return response.getBody().toString();
//        return response.getBody().getFact();
    }
}