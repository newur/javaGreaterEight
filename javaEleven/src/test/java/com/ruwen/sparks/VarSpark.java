package com.ruwen.sparks;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class VarSpark {

    // following line would NOT compile
    // var name = "Guenther";

    @Test
    void varExample() {
        PremiumCustomerWithManyInsurancesBeforeTwoThousand premiumCustomer =
                findPremiumCustomerWithManyInsurancesBeforeTwoThousand();

        // or

        var premiumCustomerX = findPremiumCustomerWithManyInsurancesBeforeTwoThousand();

        // do stuff with customer...
    }

    @Test
    void varInLambda() {

        VariousSpark variousSpark = new VariousSpark();
        variousSpark.someMethod();

        Optional.of("foo")
                // IntelliJ 2018.2.4 thinks this is invalid syntax, but it is fine
                .filter((var x) -> x.equals("bar"))
                .isPresent();
    }

    @Test
    void whyVarInLambda() {
        Optional.of("foo")
                // so you can add annotations to it. Still feels.. hacky?!
                .filter((@NotNull var x) -> x.equals("bar"))
                .isPresent();
    }

    private PremiumCustomerWithManyInsurancesBeforeTwoThousand findPremiumCustomerWithManyInsurancesBeforeTwoThousand() {
        return new PremiumCustomerWithManyInsurancesBeforeTwoThousand();
    }

    private class PremiumCustomerWithManyInsurancesBeforeTwoThousand {}
}
