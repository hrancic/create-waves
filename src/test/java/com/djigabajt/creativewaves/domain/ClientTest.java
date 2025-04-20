package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ClientTest {

    private static final Name VALID_NAME = new Name("John", "Doe");

    @Test
    void client_should_have_an_id() {
        Client client = Client.create(VALID_NAME);
        assertThat(client.getId()).isNotNull();
    }

    @Test
    void client_should_have_a_getName() {
        assertThatThrownBy(() -> Client.create(null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void clients_are_not_necessarily_the_same_if_their_names_match() {
        Client client1 = Client.create(VALID_NAME);
        Client client2 = Client.create(VALID_NAME);

        assertThat(client1).isNotEqualTo(client2);
        assertThat(client1.hashCode()).isNotEqualTo(client2.hashCode());
    }

    @Test
    void client_stays_the_same_when_his_name_changes() {
        // given
        Client client = Client.create(VALID_NAME);
        int hashBeforeNameUpdate = client.hashCode();
        // when
        Name newName = new Name("Johnatan", "Doe");
        client.updateName(newName);
        // then
        int hashAfterNameUpdate = client.hashCode();
        assertThat(hashBeforeNameUpdate).isEqualTo(hashAfterNameUpdate);
    }

}