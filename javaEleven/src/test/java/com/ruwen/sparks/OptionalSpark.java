package com.ruwen.sparks;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalSpark {

    @Test
    void isEmpty() {
        boolean isNotBar = Optional.of("foo")
                .filter("bar"::equals)
                .isEmpty();

        // instead of !Optional.of()...isPresent()

        System.out.println(isNotBar);
    }

    @Test
    void toStream() {
        Stream.of("xx", "zz")
                .map(this::findString)
                .flatMap(Optional::stream)
                .forEach(System.out::println);
    }

    private Optional<String> findString(String s) {
        return Optional.of(s + " " + s);
    }

    @Test
    void ifPresentOrElse() {
        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Optional is empty"));
    }
}
