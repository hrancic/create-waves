package com.djigabajt.creativewaves.domain;

public record Client(ClientId clientId) {

    public Client() {
        this(ClientId.getNext());
    }
}
