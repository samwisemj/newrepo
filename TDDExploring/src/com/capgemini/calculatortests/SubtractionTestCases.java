package com.capgemini.calculatortests;


import org.junit.Assert;
import org.junit.Test;

import com.capgemini.calculator.Calculator;

public class SubtractionTestCases {

	//test Two Positives Lesser And Greater
	@Test
	public void testTwoPositivesLesserAndGreater() {
		Calculator calc = new Calculator();
		int ans = calc.sub(10, 20);
		Assert.assertEquals(-10, ans);
	}

	//testTwoPositivesGreaterAndLesser
	@Test
	public void testTwoPositivesGreaterAndLesser() {
		Calculator calc = new Calculator();
		int ans = calc.sub(20, 10);
		Assert.assertEquals(10, ans);
	}

	//test Two Negatives Greater And Lesser
	@Test
	public void testTwoNegativesGreaterAndLesser() {
		Calculator calc = new Calculator();
		int ans = calc.sub(-20, -10);
		Assert.assertEquals(-10, ans);
	}

	//test Two Negatives Lesser And Greater
	@Test
	public void testTwoNegativesLesserAndGreater() {
		Calculator calc = new Calculator();
		int ans = calc.sub(-10, -20);
		Assert.assertEquals(10, ans);
	}

	//test A Greater Positive And Lesser Negative
	@Test
	public void testAGreaterPositiveAndLesserNegative() {
		Calculator calc = new Calculator();
		int ans = calc.sub(30, -20);
		Assert.assertEquals(50, ans);
	}
	
	//test A Greater Negative And Lesser Positive 
	@Test
	public void testAGreaterNegativeAndLesserPositive() {
		Calculator calc = new Calculator();
		int ans = calc.sub(-30, 20);
		Assert.assertEquals(-50, ans);
	}

}
