package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ClientTest {

    private final Name name = new Name();

    @Test
    void client_should_have_and_id() {
        Client client = Client.create(name);
        assertThat(client.clientId()).isNotNull();
    }

    @Test
    void client_should_have_a_name() {
        assertThatThrownBy(() -> Client.create(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("Client name must not be null");
    }
}