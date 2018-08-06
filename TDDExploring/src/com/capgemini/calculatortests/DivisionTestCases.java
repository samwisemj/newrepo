package com.capgemini.calculatortests;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.calculator.Calculator;

public class DivisionTestCases {


	//test Bigger Dividend Smaller Divisor
	@Test
	public void testBiggerDividendSmallerDivisor() throws Exception {
		Calculator calc = new Calculator();
		double ans = calc.divide(10.00, 5.00);
		Assert.assertEquals(2.00, ans, 0.0);
	}

	//test Divide By Zero
	@Test//  (expected = Exception.class)
	public void testDivideByZero() throws Exception {
		Calculator calc = new Calculator();
		double ans = calc.divide(10.0, 0.0);

		Assert.assertEquals(Double.POSITIVE_INFINITY,ans,0);

	}
	
	//testZeroDivideByZero
	@Test//  (expected = Exception.class)
	public void testZeroDivideByZero() throws Exception {
		Calculator calc = new Calculator();
		double ans = calc.divide(0.0, 0.0);
		Assert.assertEquals(Double.NaN,ans,0);

	}
	//test Zero Divide By Any Number
	@Test//  (expected = Exception.class)
	public void testZeroDivideByAnyNumber() throws Exception {
		Calculator calc = new Calculator();
		double ans = calc.divide(0.0, 50.0);
		Assert.assertEquals(0.0,ans,0);

	}

}
