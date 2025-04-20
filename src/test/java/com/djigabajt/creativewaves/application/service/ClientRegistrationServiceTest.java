package com.djigabajt.creativewaves.application.service;

import com.djigabajt.creativewaves.application.port.outbound.ForStoringClients;
import com.djigabajt.creativewaves.domain.Client;
import com.djigabajt.creativewaves.domain.Name;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doThrow;

@ExtendWith(MockitoExtension.class)
class ClientRegistrationServiceTest {

    @Mock
    private ForStoringClients forStoringClients;
    @InjectMocks
    private ClientRegistrationService clientRegistrationService;

    @Test
    void should_register_client() {
        // given
        Client client = givenClient();

        // when
        ClientRegistrationResult result = clientRegistrationService.register(client);

        // then
        assertThat(result.success()).isTrue();
    }



    @Test
    void client_registration_should_fail_when_storing_to_repository_fails() {
        // given
        Client client = givenClient();
        doThrow(new RuntimeException("Storing client failed")).when(forStoringClients).store(client);
        // when
        ClientRegistrationResult result = clientRegistrationService.register(client);
        // then
        assertThat(result.success()).isFalse();
    }

    private static Client givenClient() {
        Name clientName = new Name("John", "Doe");
        return Client.create(clientName);
    }
}