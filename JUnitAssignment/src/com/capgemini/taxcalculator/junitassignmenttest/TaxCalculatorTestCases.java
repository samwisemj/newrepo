package com.capgemini.taxcalculator.junitassignmenttest;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.taxcalculator.junitassignment.TaxCalculator;

public class TaxCalculatorTestCases {

	//test case to check for non indian nationality
	@Test
	public void testcase1() throws Exception {
	TaxCalculator tax=new TaxCalculator();
	double answer = tax.calculateTax("Ron",3500.00,false);
	Assert.assertEquals(0.0, answer,0.0);
	}

	//test case to check for valid tax calculation
	@Test
	public void testcase2() throws Exception {
	TaxCalculator tax=new TaxCalculator();
	double answer = tax.calculateTax("Tim",55000.00,true);
	Assert.assertEquals(3300.00, answer,0.0);
	}
	
	//test case to check for invalid name
	@Test
	public void testcase3() throws Exception {
	TaxCalculator tax=new TaxCalculator();
	double answer = tax.calculateTax(null,30000.00,true);
	Assert.assertEquals(0.0, answer,0.0);
	}
	
}
