/**
 * 
 */
package com.des.app;

/**
 * 
 * @author Naveen_Kumar_K
 *
 */
public interface CurrencyDenomination {
	
	Denominations[] populateCurrencyDenominations();
	String provideCurrencyDenomination(final double totalChange);
}
