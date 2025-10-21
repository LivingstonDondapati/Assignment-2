package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=scanner.nextInt();
		String result=(a>0)?"Positive":(a<0)?"Negative":"Zero";
		System.out.println(result);
		scanner.close();

	}

}