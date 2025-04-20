package com.djigabajt.creativewaves.application.port.outbound;

import com.djigabajt.creativewaves.domain.Client;

public interface ForStoringClients {
    void store(Client client);
}
