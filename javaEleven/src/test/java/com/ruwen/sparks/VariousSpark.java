package com.ruwen.sparks;

public class VariousSpark {

    // allowed before java 9, but forbidden since java 9: the (single) underscore variable
    // String _ = "someString"
    // but there is no actual allowed use case for it by now. See http://openjdk.java.net/jeps/302

    // new attributes
    @Deprecated(since = "1.2.3", forRemoval = true)
    public void someMethod() { }

    public void useDeprectaedMethod() {
        someMethod();
    }

}
