package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Utility utility = new Utility();
		int num = utility.getInt();
		utility.prime(num);
	}
}
