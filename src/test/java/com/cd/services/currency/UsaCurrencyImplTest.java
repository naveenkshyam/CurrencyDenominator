package com.cd.services.currency;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UsaCurrencyImplTest {

    private static UsaCurrencyImpl currencyImp;

    private static final String RESULT_87 = "3 Quarters,1 Dime,2 Pennies";
    private static final String RESULT_287 = "2 Dollars,3 Quarters,1 Dime,2 Pennies";
    private static final String RESULT_NO_CHANGE = "No Change to return";

    @BeforeAll
    static void setup() {
        currencyImp = new UsaCurrencyImpl();
    }

    @Test
    void testgetCurrencyDenomination() {
        String result = currencyImp.getCurrencyDenomination(87);
        Assertions.assertEquals(RESULT_87, result);
    }

    @Test
    void testgetCurrencyDenominationAnotherValue() {
        String result = currencyImp.getCurrencyDenomination(287);
        Assertions.assertEquals(RESULT_287, result);
    }

    @Test
    void testgetCurrencyDenominationNoChange() {
        String result = currencyImp.getCurrencyDenomination(0);
        Assertions.assertEquals(RESULT_NO_CHANGE, result);
    }

    @AfterAll
    static void finish() {
        currencyImp = null;
    }

}
