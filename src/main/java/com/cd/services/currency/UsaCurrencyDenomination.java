package com.cd.services.currency;

public enum UsaCurrencyDenomination {
    DOLLAR(100.0, "Dollar", "Dollars"), QUARTER(25.0, "Quarter", "Quarters"), DIME(10.0, "Dime", "Dimes"),
    NICKEL(5.0, "Nickel", "Nickels"), PENNY(1.0, "Penny", "Pennies");

    private Double value;
    private String name;
    private String multiples;

    private UsaCurrencyDenomination(Double value, String name, String multiples) {
        this.value = value;
        this.name = name;
        this.multiples = multiples;
    }

    public Double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getMultiples() {
        return multiples;
    }

}
