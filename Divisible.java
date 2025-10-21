package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=scanner.nextInt();
		String result=(a%5==0)?"Divisible by 5":"Not Divisible by 5";
		System.out.println(result);
		scanner.close();

	}

}