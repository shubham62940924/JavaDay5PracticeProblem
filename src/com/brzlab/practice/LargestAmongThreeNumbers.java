package com.brzlab.practice;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter your numbers");
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();
		if (a > b && a > c)
			System.out.println("greater number is" + a);
		else if (b > a && b > c)
			System.out.println("greater number is" + b);
		else
			System.out.println("greater number is" + c);

	}
}
