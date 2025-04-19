package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClientTest {

    @Test
    void client_should_have_and_id() {
        Client client = new Client();
        assertThat(client.clientId()).isNotNull();
    }
}