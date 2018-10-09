package com.ruwen.sparks;

import org.junit.jupiter.api.Test;

public class StringSpark {

    // for difference between trim() and strip() see
    // https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11

    @Test
    void stripString() {
        String stringWithWhitespaces = "    before and after are multiple whitespaces    ";
        String boundary = "|";

        printWithBoundaries(stringWithWhitespaces, boundary);
        printWithBoundaries(stringWithWhitespaces.stripTrailing(), boundary);
        printWithBoundaries(stringWithWhitespaces.stripLeading(), boundary);
        printWithBoundaries(stringWithWhitespaces.strip(), boundary);
    }

    @Test
    void isWhiteSpace() {
        System.out.println(Character.isWhitespace(' '));
    }

    private void printWithBoundaries(String value, String boundary) {
        System.out.println(boundary + value + boundary);
    }
}
