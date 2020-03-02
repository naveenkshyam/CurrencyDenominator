package com.cd.services.currency;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IndianCurrencyImplTest {

    private static IndianCurrencyImpl currencyImp;

    private static final String RESULT_87 = "1 Fifty Paise,1 Twenty Five Paise,1 Ten Paise,2 One Paise";
    private static final String RESULT_287 = "1 Two Rupee,1 Fifty Paise,1 Twenty Five Paise,1 Ten Paise,2 One Paise";
    private static final String RESULT_NO_CHANGE = "No Change to return";

    @BeforeAll
    static void setup() {
        currencyImp = new IndianCurrencyImpl();
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
