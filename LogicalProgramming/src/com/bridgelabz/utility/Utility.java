package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public int getInt()
	{
		return scanner.nextInt();
	}
	public void fibonacci(int term)
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a+" "+b+" ");
		for (int i = 0;i < term - 2;i++)
		{
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum+" ");
		}
	}
	public void perfectnum(int num) {
		int sum = 0;
		for (int i = 1;i < num;i++)
		{
			 if (num % i == 0)
			 {
				 sum = sum + i;
			 }
		}
		if (sum == num)
		{
			System.out.println("The given number "+num+" is a perfect number");
		}
		else
		{
			System.out.println("The given number "+num+" is not a perfect number");
		}
	}
	public void prime(int num) {
		int count = 0;
		for (int i = 1;i < num;i++)
		{
			if (num % i ==0)
			{
				count++;
			}
		}
		if (count == 1)
		{
			System.out.println("The given number "+num+" is a prime number");
		}
		else
		{
			System.out.println("The given number "+num+" is not a prime number");
		}
		
	}
	public void reverseNumber(int num) {
		int d = 0;
		while (num != 0)
		{
			int r = num%10;
			d = d*10 +r;
			num = num/10;
		}
		System.out.println("The reverse of the given number is "+d);
	}
	public long start() {
		return System.currentTimeMillis();
	}
	public long stop() {
		return System.currentTimeMillis();
	}
	public void time(long start,long stop)
	{
		long duration = (stop - start)/1000;
		System.out.println("The time on stopwatch is "+duration+" seconds");
	}
	
}
