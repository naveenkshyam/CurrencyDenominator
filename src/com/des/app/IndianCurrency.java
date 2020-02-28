/**
 * 
 */
package com.des.app;


/**
 * @author Naveen_Kumar_K
 *
 */
public class IndianCurrency implements CurrencyDenomination {

	@Override
	public Denominations[] populateCurrencyDenominations() {
		Denominations[] currencyDenom = new Denominations[6];
		currencyDenom[0] = new Denominations(1, "One Paise");
		currencyDenom[1] = new Denominations(10, "Ten Paise");
		currencyDenom[2] = new Denominations(25, "Twenty Five Paise");
		currencyDenom[3] = new Denominations(50, "Fifty Paise");
		currencyDenom[4] = new Denominations(100, "One Rupee");
		currencyDenom[5] = new Denominations(200, "Two Rupee");
		return currencyDenom;
	}

	@Override
	public String provideCurrencyDenomination(double totalChange) {
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
					changeReturned = changeReturned + " " + count + " " + denomCurrency[i].getName();
					break;
				}
				count = (int) Math.floor(remAmount / denomCurrency[i].getValue());
				remAmount = remAmount % denomCurrency[i].getValue();
				if (remAmount > 0) {
					changeReturned = changeReturned + " " + count + " " + denomCurrency[i].getName()+ ",";
				}else {
					changeReturned = changeReturned + " " + count + " " + denomCurrency[i].getName();
				}
			}
		} else {
			changeReturned = "No Change to return";
		}
		return changeReturned;
	}

}
