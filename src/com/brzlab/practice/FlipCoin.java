package com.brzlab.practice;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numOfTimes = scanner.nextInt();
//		
		Random random = new Random();
		double flipCoin;
		double headCount = 0;
		double tailCount = 0;
		double headCountPercentage = 0;
		double tailCountPercentage = 0;

		for (int i = 1; i <= numOfTimes; i++) {
			flipCoin = random.nextDouble(2);
			if (flipCoin < 0.5) {
				tailCount++;
			} else {
				headCount++;
			}

		}
		headCountPercentage = (headCount / numOfTimes) * 100;
		tailCountPercentage = (tailCount / numOfTimes) * 100;
		System.out.println("headCount: " + headCount + "\nheadCountPercentage: " + headCountPercentage);
		System.out.println("tailCount: " + tailCount + "\ntailCountPercentage: " + tailCountPercentage);
	}

}
