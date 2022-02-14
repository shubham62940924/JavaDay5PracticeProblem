package com.brzlab.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = src.nextInt();

		if (year % 400 == 0)
			System.out.println("It is a leap year:");
		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println("\nIt is a Leap Year.");
		else
			System.out.println("it is not a leap year");

	}

}
