/**
 *
 */
package com.cd.services.currency;

/**
 * @author Naveen_Kumar_K
 */
public class UsaCurrencyImpl implements Currency {

    @Override
    public String getCurrencyDenomination(final double totalChange) {
        double remainingAmount = totalChange;
        String changeReturned = "";
        int count = 1;

        if (remainingAmount <= 0) {
            return "No Change to return";
        }

        for (UsaCurrencyDenomination denomCurrency : UsaCurrencyDenomination.values()) {
            if (denomCurrency.getValue() > remainingAmount) {
                continue;
            }
            if (denomCurrency.getValue() == remainingAmount) {
                changeReturned = changeReturned + getDenominationName(count, denomCurrency);
                break;
            }
            count = (int) Math.floor(remainingAmount / denomCurrency.getValue());
            remainingAmount = remainingAmount % denomCurrency.getValue();
            if (remainingAmount > 0) {
                changeReturned = changeReturned + getDenominationName(count, denomCurrency) + ",";
            } else {
                changeReturned = changeReturned + getDenominationName(count, denomCurrency);
            }
        }

        return changeReturned;
    }

    private String getDenominationName(int count, UsaCurrencyDenomination denomination) {
        return count + " " + (count > 1 ? denomination.getMultiples() : denomination.getName());
    }

}
