package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Stopwatch {
	public static void main(String[] args) {
		System.out.println("Press 1 to start the stopwatch and 2 to stop");
		Utility utility = new Utility();
		int start = utility.getInt();
		long start1 = 0;
		long stop1 = 0;
		if(start == 1)
		{
			start1 = utility.start();
		}
		else
		{
			System.out.println("Invalid input. Press 1");
		}
		int stop = utility.getInt();
		if(stop == 2)
		{
			stop1 = utility.stop();
		}
		else
		{
			System.out.println("Invalid input. Press 2");
		}
		utility.time(start1, stop1);
	}
}
