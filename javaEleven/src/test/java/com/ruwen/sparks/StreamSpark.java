package com.ruwen.sparks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamSpark {

    @Test
    void streamSingleElementOrNull() {
        // takes one element max.
        Stream.ofNullable("la")
                .forEach(x -> System.out.println("Foo " + x));
    }

    @Test
    public void stream_takeWhile() {
        // deterministic only on ordered streams
        List.of("a", "b", "c").stream()
                .takeWhile(x -> x.equals("a") || x.equals("c"))
                .forEach(System.out::println);
    }

    @Test
    void streamOnUnordered_takeWhile_nonDeterministic() {
        Set.of("a", "b", "c").stream()
                .takeWhile(x -> x.equals("a") || x.equals("c"))
                .forEach(System.out::println);
    }

    @Test
    void stream_dropWhile() {
        Stream.of("a", "b", "c", "d")
                .dropWhile(x -> !x.equals("c"))
                .forEach(System.out::print);
    }
}
