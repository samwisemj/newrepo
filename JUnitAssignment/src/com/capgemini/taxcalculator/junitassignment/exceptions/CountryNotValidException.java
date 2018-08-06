package com.capgemini.taxcalculator.junitassignment.exceptions;

public class CountryNotValidException extends Exception{

	/**
	 * Exception class for invalid country
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee should be an Indian";
	}

	
}
