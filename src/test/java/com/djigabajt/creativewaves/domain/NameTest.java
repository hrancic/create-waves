package com.djigabajt.creativewaves.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    public static Stream<Arguments> givenInvalidNamesAndExpectedExceptions() {
        return Stream.of(
                Arguments.of(" ", " ", IllegalArgumentException.class),
                Arguments.of(" ", null, IllegalArgumentException.class),
                Arguments.of(null, " ", IllegalArgumentException.class),
                Arguments.of(null, null, IllegalArgumentException.class),
                Arguments.of("", "", IllegalArgumentException.class),
                Arguments.of("", null, IllegalArgumentException.class),
                Arguments.of(null, "", IllegalArgumentException.class),
                Arguments.of("A".repeat(101), "Adams", IllegalArgumentException.class),
                Arguments.of("Adam", "A".repeat(101), IllegalArgumentException.class)
        );
    }

    @ParameterizedTest
    @MethodSource("givenInvalidNamesAndExpectedExceptions")
    void should_contain_firstname_and_lastname(String firstName, String lastName, Class<? extends RuntimeException> expectedException) {
        assertThatThrownBy(()->new Name(firstName, lastName))
                .isInstanceOf(expectedException);

    }

}