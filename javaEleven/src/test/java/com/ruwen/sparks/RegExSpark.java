package com.ruwen.sparks;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class RegExSpark {

    @Test
    void asPredicate() {
        String s = "foobar123";

        // is there ANY non digit?
        Predicate<String> asPredicate = Pattern.compile("\\D").asPredicate();

        Optional.of(s)
                .filter(asPredicate)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
    }

    @Test
    void asMatchPredicate() {
        String s = "foobar123";

        // is it ALL non digit?
        Predicate<String> asPredicate = Pattern.compile("\\D").asMatchPredicate();

        Optional.of(s)
                .filter(asPredicate)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not matching"));
    }
}
