package com.des.app;

public class Denominations {

	private double value;
	private String name;
	private String multiplesName;

	Denominations(double value, String name) {
		this.value = value;
		this.name = name;
	}

	Denominations(double value, String name, String multiplesName) {
		this.value = value;
		this.name = name;
		this.multiplesName = multiplesName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public String getMultiplesName() {
		return multiplesName;
	}

}
