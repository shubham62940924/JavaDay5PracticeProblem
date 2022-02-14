package com.brzlab.practice;

import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		System.out.println("enter two numbers:");
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int swap = a;
		a = b;
		b = swap;
		System.out.println("swapping of number a is:" + a);
		System.out.println("swapping of number b is:" + b);

	}

}
