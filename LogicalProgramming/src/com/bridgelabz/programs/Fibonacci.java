package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter number of terms in fibonacci series");
		Utility utility = new Utility();
		int term = utility.getInt();
		utility.fibonacci(term);
	}
}
