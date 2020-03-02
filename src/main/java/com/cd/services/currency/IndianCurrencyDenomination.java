package com.cd.services.currency;

import java.util.stream.Stream;

public enum IndianCurrencyDenomination {
    TWO_RUPEE(200.0, "Two Rupee"), ONE_RUPEE(100.0, "One Rupee"), FIFTY_PAISE(50.0, "Fifty Paise"),
    TWENTYFIVE_PAISE(25.0, "Twenty Five Paise"), TEN_PAISE(10.0, "Ten Paise"), ONE_PAISE(1.0, "One Paise");

    private Double value;
    private String name;

    private IndianCurrencyDenomination(Double value, String name) {
        this.value = value;
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Stream<IndianCurrencyDenomination> stream() {
        return Stream.of(IndianCurrencyDenomination.values());
    }

}
