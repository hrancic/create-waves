package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ClientTest {

    private static final Name VALID_NAME = new Name("John", "Doe");

    @Test
    void client_should_have_an_id() {
        Client client = Client.create(VALID_NAME);
        assertThat(client.clientId()).isNotNull();
    }

    @Test
    void client_should_have_a_name() {
        assertThatThrownBy(() -> Client.create(null))
                .isInstanceOf(NullPointerException.class);
    }
}