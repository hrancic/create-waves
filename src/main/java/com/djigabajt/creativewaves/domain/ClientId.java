package com.djigabajt.creativewaves.domain;

import java.util.UUID;

public record ClientId(String id) {

    private ClientId() {
        this(UUID.randomUUID().toString());
    }

    public static ClientId getNext() {
        return new ClientId();
    }

}
