package com.djigabajt.creativewaves.adapter.inbound;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients")
public class RegistrationRestController {


    @PostMapping
    public ResponseEntity<Void> registerClient(@RequestBody ClientRegistrationRequest request) {
        // Logic to handle client registration
        return ResponseEntity.ok().build();
    }


}
