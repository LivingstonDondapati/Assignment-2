package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:");
		int a = scanner.nextInt();
		String result=((a%4==0 && a%100!=0) || a%400==0)?"Leap year":"not a Leap year";
		System.out.println(result);
		scanner.close();
	}

}