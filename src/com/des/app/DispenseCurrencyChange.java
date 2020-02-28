package com.des.app;

public class DispenseCurrencyChange {

	public static void main(String[] args) {
		
		CurrencyDenomination usaCD = new UsaCurrency();
		System.out.println("Usa Currency Denomination change : " + usaCD.provideCurrencyDenomination(287));
		

		CurrencyDenomination indiaCD = new IndianCurrency();
		System.out.println("India Currency Denomination change : "+ indiaCD.provideCurrencyDenomination(287));
	}

}
