package com.capgemini.taxcalculator.junitassignment.exceptions;

public class TaxNotEligibleException extends Exception{

	/**
	 * Exception class for no tax 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee does not need to pay tax";
	}
	

}
