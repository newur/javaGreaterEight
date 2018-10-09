package com.ruwen.sparks;

import org.junit.jupiter.api.Test;

public class DeprecatedSpark {

    @Test
    void deprecatedMarkedForRemoval() {
        VariousSpark variousSpark = new VariousSpark();
        variousSpark.someMethod();
    }

    @Test
    void deprecatedSince() {
        VariousSpark variousSpark = new VariousSpark();
        // press Ctrl + Q for Quick Docu and see since which version it is deprecated
        variousSpark.someMethod();
    }
}
