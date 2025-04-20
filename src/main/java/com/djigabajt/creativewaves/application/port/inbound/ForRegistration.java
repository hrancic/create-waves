package com.djigabajt.creativewaves.application.port.inbound;

import com.djigabajt.creativewaves.application.service.ClientRegistrationResult;
import com.djigabajt.creativewaves.domain.Client;

public interface ForRegistration {
    ClientRegistrationResult register(Client client);
}
