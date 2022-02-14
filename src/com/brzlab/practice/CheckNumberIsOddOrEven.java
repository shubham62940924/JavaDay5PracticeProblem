package com.brzlab.practice;

import java.util.Scanner;

public class CheckNumberIsOddOrEven {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter your numbers:");
		int num = src.nextInt();
		if (num % 2 == 0) {
			System.out.println("it is even numbers");

		} else
			System.out.println("it is odd numbers");

	}

}
