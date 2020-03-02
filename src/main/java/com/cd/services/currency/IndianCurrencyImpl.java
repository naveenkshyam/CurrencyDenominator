/**
 *
 */
package com.cd.services.currency;

/**
 * @author Naveen_Kumar_K
 */
public class IndianCurrencyImpl implements Currency {

    @Override
    public String getCurrencyDenomination(double totalChange) {
        double remainingAmount = totalChange;
        String changeToReturn = "";
        int count = 1;

        if (remainingAmount <= 0) {
            return "No Change to return";
        }

        for (IndianCurrencyDenomination denomCurrency : IndianCurrencyDenomination.values()) {
            if (denomCurrency.getValue() > remainingAmount) {
                continue;
            }
            if (denomCurrency.getValue() == remainingAmount) {
                changeToReturn = changeToReturn + count + " " + denomCurrency.getName();
                break;
            }
            count = (int) Math.floor(remainingAmount / denomCurrency.getValue());
            remainingAmount = remainingAmount % denomCurrency.getValue();
            if (remainingAmount > 0) {
                changeToReturn = changeToReturn + count + " " + denomCurrency.getName() + ",";
            } else {
                changeToReturn = changeToReturn + count + " " + denomCurrency.getName();
            }
        }
        return changeToReturn;
    }

}
