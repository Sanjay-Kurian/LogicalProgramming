package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Utility utility = new Utility();
		int num = utility.getInt();
		utility.reverseNumber(num);
	}
}
