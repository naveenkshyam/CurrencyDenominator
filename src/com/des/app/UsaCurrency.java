/**
 * 
 */
package com.des.app;

/**
 * @author Naveen_Kumar_K
 *
 */
public class UsaCurrency implements CurrencyDenomination {

	@Override
	public Denominations[] populateCurrencyDenominations() {
		Denominations[] currencyDenom = new Denominations[5];
		currencyDenom[0] = new Denominations(1, "Penny", "Pennies");
		currencyDenom[1] = new Denominations(5, "Nickel", "Nickels");
		currencyDenom[2] = new Denominations(10, "Dime", "Dimes");
		currencyDenom[3] = new Denominations(25, "Quarter", "Quarters");
		currencyDenom[4] = new Denominations(100, "Dollar", "Dollars");
		return currencyDenom;
	}

	@Override
	public String provideCurrencyDenomination(final double totalChange) {
		double remAmount = totalChange;
		String changeReturned = "";
		int count = 1;

		Denominations[] denomCurrency = populateCurrencyDenominations();

		if (remAmount != 0) {
			for (int i = denomCurrency.length - 1; i >= 0; i--) {
				if (denomCurrency[i].getValue() > remAmount) {
					continue;
				}
				if (denomCurrency[i].getValue() == remAmount) {
					changeReturned = changeReturned + getDenominationName(count, denomCurrency[i]);
					break;
				}
				count = (int) Math.floor(remAmount / denomCurrency[i].getValue());
				remAmount = remAmount % denomCurrency[i].getValue();
				if (remAmount > 0) {
					changeReturned = changeReturned + getDenominationName(count, denomCurrency[i]) +",";
				}else {
					changeReturned = changeReturned + getDenominationName(count, denomCurrency[i]);
				}
			}
		} else {
			changeReturned = "No Change to return";
		}
		return changeReturned;
	}

	private String getDenominationName(int count, Denominations denomination) {
		return " " + count + " " + (count > 1 ? denomination.getMultiplesName() : denomination.getName());
	}

}
