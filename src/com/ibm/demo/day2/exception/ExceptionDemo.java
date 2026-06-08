package com.ibm.demo.day2.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		int num3 = 0;

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter an integer: ");
			int num = sc.nextInt();
			System.out.println("Enter another one: ");
			int num2 = sc.nextInt();
			num3 = num / num2;
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("Wrong!");
		} finally {
			System.out.println(num3);
		}

	}

}