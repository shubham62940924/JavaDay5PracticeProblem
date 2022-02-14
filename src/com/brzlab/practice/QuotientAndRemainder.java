package com.brzlab.practice;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of divisor:");
		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		int qoutient = divisor / divident;
		int remainder = divisor % divident;
		System.out.println("qoutient value:" + qoutient);
		System.out.println("remainder:" + remainder);

	}

}
