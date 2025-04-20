package com.djigabajt.acceptance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Driver {

    private final RestTemplate restTemplate;
    private String baseUrl;

    public Driver() {
        this.restTemplate = new RestTemplate();
    }

    @Value("${local.server.port}")
    public void setBaseUrl(int port) {
        this.baseUrl = "http://localhost:" + port;
    }

    public ResponseEntity<Void> registerClient(Object requestPayload) {
        String url = baseUrl + "/api/v1/clients";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<Object> request = new HttpEntity<>(requestPayload, headers);
        return restTemplate.postForEntity(url, request, Void.class);
    }
}
