package com.test.codecov.calc;

public class CalculateObjects {

	public int getAddition(int A, int B) {
		return (A+B);
	}
	
	public int getMultiplication(int A, int B) {
		return (A*B);
	}
	
	public double getDivision(double A, double B) {
		return (A/B);
	}
	
	public int getSubstraction(int A, int B) {
		return (A-B);
	}
	
	public int getHighestNumber(int A, int B) {
		return (A > B) ? A : B;
	}
	
	public int getLowestNumber(int A, int B) {
		return (A < B) ? A : B;
	}
	
	public int getReminderValue(int A, int B) {
		return A%B;
	}
	
	public int getSumOfDigits(int A) {
		int sum = 0;
		while(A > 0) {
			sum = sum + (A%10);
			A=A/10;
		}
		return sum;
	}
	
	public int getCountOfN(int N) {
		return (N*(N+1))/2;
	}
	
	public int getReverse(int A) {
		int sum = 0;
		while(A > 0) {
			sum = sum * 10 + (A%10);
			A=A/10;
		}
		return sum;
	}
	
}
