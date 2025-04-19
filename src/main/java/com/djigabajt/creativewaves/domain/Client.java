package com.djigabajt.creativewaves.domain;

import static java.util.Objects.requireNonNull;

public record Client(ClientId clientId, Name name) {


    private Client(Name name) {
        this(ClientId.getNext(), name);
    }

    public static Client create(Name name) {
        requireNonNull(name, "Client name must not be null");
        return new Client(name);
    }
}
