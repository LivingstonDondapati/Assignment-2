package com.codegnan.operatorsexamples;
import java.util.Scanner;

public class AsciValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char n=scanner.next().charAt(0);
		int a=(int)n;
		System.out.println(a);
		scanner.close();
	}

}