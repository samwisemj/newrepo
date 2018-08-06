package com.capgemini.taxcalculator.junitassignment.exceptions;

public class EmployeeNameInvalidExceptions extends Exception {

	/**
	 * Exception class for invalid name
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee name cannot be empty";
	}

}
