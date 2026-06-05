package com.ibm.demo.day2;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] arr = { 25 , 31 , 17 , 9 , 22 } ;
		System.out.println("Original Array ");
		System.out.println(arr);
		
		for ( int a : arr)
			System.out.println(a);
		System.out.println(arr.length);
		
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for ( int a : arr)
			System.out.println(a);
		
	}
}
