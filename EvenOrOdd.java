package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=scanner.nextInt();
		String result=(a%2==0)?"Even":"odd";
		System.out.println(result);
		scanner.close();
	}

}