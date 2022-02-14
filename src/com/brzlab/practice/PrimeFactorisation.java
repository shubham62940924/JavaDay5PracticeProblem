package com.brzlab.practice;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value");
		int Number = scanner.nextInt();
		for (int i = 1; i <= Number; i++) {
			if (Number % i == 0) {
				System.out.println("value" + i);
			}
		}
	}
}
