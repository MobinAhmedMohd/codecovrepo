package com.test.codecov.calc;

import org.junit.Test;
import org.junit.Assert;

public class CalculateObjectsTest {

	CalculateObjects calObjects = null;
	
	public CalculateObjectsTest(){
		calObjects = new CalculateObjects();
	}
	
	@Test
	public void testGetAddition() {
		int A = 5;
		int B=7;
		int C = calObjects.getAddition(A, B);
		Assert.assertEquals(12, C);
	}
	
	@Test
	public void testGetMultiplication() {
		int A = 5;
		int B=7;
		int C = calObjects.getMultiplication(A, B);
		Assert.assertEquals(35, C);
	}
	
	@Test
	public void testGetDivision() {
		double A = 10;
		double B=2;
		double C = calObjects.getDivision(A, B);
		int d = (int)C;
		Assert.assertEquals(5, d);
	}
	
	@Test
	public void testGetSubstraction() {
		int A=10;
		int B=2;
		Assert.assertEquals(8, calObjects.getSubstraction(A, B));
	}
	
	@Test
	public void testGetHighestNumber() {
		int A=10;
		int B=5;
		Assert.assertEquals(A, calObjects.getHighestNumber(A, B));
		A=5;
		B=10;
		Assert.assertNotEquals(A, calObjects.getHighestNumber(A, B));
	}
	
	@Test
	public void testGetLowestNumber() {
		int A=10;
		int B=5;
		Assert.assertEquals(B, calObjects.getLowestNumber(A, B));
		A=5;
		B=10;
		Assert.assertNotEquals(B, calObjects.getLowestNumber(A, B));
	}
	
	@Test
	public void testGetReminderValue() {
		int A=10;
		int B=4;
		Assert.assertEquals(2, calObjects.getReminderValue(A, B));
	}
	
	@Test
	public void testGetSumOfDigits() {
		int A=456;
		Assert.assertEquals(15, calObjects.getSumOfDigits(A));
	}
	
	@Test
	public void testGetCountOfN() {
		int A=3;
		Assert.assertEquals(6, calObjects.getCountOfN(A));
	}
	
	@Test
	public void testGetReverse() {
		int A=456;
		Assert.assertEquals(654, calObjects.getReverse(A));
	}
}
