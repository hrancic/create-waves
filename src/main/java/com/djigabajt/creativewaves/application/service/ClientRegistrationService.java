package com.djigabajt.creativewaves.application.service;

import com.djigabajt.creativewaves.domain.Client;

public class ClientRegistrationService {

    public ClientRegistrationResult register(Client client) {
        return new ClientRegistrationResult(true);
    }
}
