package com.capgemini.calculatortests;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.calculator.Calculator;

public class AdditionTestCases {

	// the following are possible test cases for additions

	// test Two Positives
	@Test
	public void testTwoPositives() {
		Calculator calc = new Calculator();
		int ans = calc.add(10, 20);
		Assert.assertEquals(30, ans);

	}

	// test Two Negatives
	public void testTwoNegatives() {
		Calculator calc = new Calculator();
		int ans = calc.add(-10, -20);
		Assert.assertEquals(-30, ans);

	}

	// test One Greater Positive And One Negative
	public void testOneGreaterPositiveAndOneNegative() {
		Calculator calc = new Calculator();
		int ans = calc.add(-10, 20);
		Assert.assertEquals(10, ans);

	}

	// test One Greater Negative And One Positive
	public void testOneGreaterNegativeAndOnePositive() {
		Calculator calc = new Calculator();
		int ans = calc.add(10, -20);
		Assert.assertEquals(-10, ans);

	}

}
