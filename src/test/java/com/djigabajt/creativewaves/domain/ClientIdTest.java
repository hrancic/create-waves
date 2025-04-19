package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClientIdTest {

    @Test
    void should_contain_unique_id() {
        ClientId clientId = ClientId.getNext();
        assertThat(clientId.id()).isNotBlank();
    }

    @Test
    void get_next_returns_different_ids() {
        ClientId clientId1 = ClientId.getNext();
        ClientId clientId2 = ClientId.getNext();

        assertThat(clientId1.id()).isNotEqualTo(clientId2.id());
    }
}