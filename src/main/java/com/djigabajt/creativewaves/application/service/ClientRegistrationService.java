package com.djigabajt.creativewaves.application.service;

import com.djigabajt.creativewaves.application.port.outbound.ForStoringClients;
import com.djigabajt.creativewaves.domain.Client;

public class ClientRegistrationService {

    private final ForStoringClients forStoringClients;

    public ClientRegistrationService(ForStoringClients forStoringClients) {
        this.forStoringClients = forStoringClients;
    }

    public ClientRegistrationResult register(Client client) {
        try {
            forStoringClients.store(client);
        } catch (Exception e) {
            return new ClientRegistrationResult(false);
        }
        return new ClientRegistrationResult(true);
    }
}
