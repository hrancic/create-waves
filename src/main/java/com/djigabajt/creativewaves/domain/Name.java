package com.djigabajt.creativewaves.domain;

public record Name(String firstName, String lastName) {

    private static final int MAX_NAME_LENGTH = 100;

    public Name {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name missing");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name missing");
        }

        if (firstName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("First name too long");
        }

        if (lastName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("Last name too long");
        }
    }
}
