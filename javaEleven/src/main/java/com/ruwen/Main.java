package com.ruwen;

import java.util.Optional;

public class Main {

    // can directly be called without explicit compiling it via 'javac'. In my case:
    // /home/ruwen/dev/java11/jdk-11/bin/java /home/ruwen/dev/git/javaEleven/src/main/java/com/ruwen/Main.java

    public static void main(String[] args) {

        var helloWorld = "Hello Java 11";

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println(helloWorld));
    }
}
