package com.djigabajt.creativewaves.domain;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public final class Client {

    private final ClientId clientId;
    private final Name name;

    private Client(Name name) {
        this.clientId = ClientId.getNext();
        this.name = name;
    }

    public static Client create(Name name) {
        requireNonNull(name, "Client name must not be null");
        return new Client(name);
    }

    public ClientId clientId() {
        return clientId;
    }

    public Name name() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Client) obj;
        return Objects.equals(this.clientId, that.clientId) &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name);
    }

    @Override
    public String toString() {
        return "Client[" +
                "clientId=" + clientId + ", " +
                "name=" + name + ']';
    }

}
