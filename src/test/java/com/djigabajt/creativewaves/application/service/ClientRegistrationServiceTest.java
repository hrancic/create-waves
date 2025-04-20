package com.djigabajt.creativewaves.application.service;

import com.djigabajt.creativewaves.domain.Client;
import com.djigabajt.creativewaves.domain.Name;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClientRegistrationServiceTest {

    @Test
    void should_register_client() {
        // given
        ClientRegistrationService clientRegistrationService = new ClientRegistrationService();
        Name clientName = new Name("John", "Doe");
        Client client = Client.create(clientName);

        // when
        ClientRegistrationResult result = clientRegistrationService.register(client);

        // then
        assertThat(result.success()).isTrue();
    }
}