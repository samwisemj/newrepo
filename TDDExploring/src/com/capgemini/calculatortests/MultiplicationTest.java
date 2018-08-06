package com.capgemini.calculatortests;


import org.junit.Assert;
import org.junit.Test;

import com.capgemini.calculator.Calculator;

public class MultiplicationTest {

	//test Two Positives
	@Test
	public void testTwoPositives() {
		Calculator calc=new Calculator();
		int ans=calc.multiply(10,20);
		Assert.assertEquals(200, ans);
	}
	
	//test Two Negatives 
	@Test
	public void testTwoNegatives() {
		Calculator calc=new Calculator();
		int ans=calc.multiply(-10,-20);
		Assert.assertEquals(200, ans);
	}
	
	//test A Positive And A Negative
	@Test
	public void testAPositiveAndANegative() {
		Calculator calc=new Calculator();
		int ans=calc.multiply(10,-20);
		Assert.assertEquals(-200, ans);
	}
	

}
