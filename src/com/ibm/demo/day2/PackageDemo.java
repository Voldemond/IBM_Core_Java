package com.ibm.demo.day2;

import java.util.Random;

public class PackageDemo {
	
	public static void main(String[] args) {
		
		Random random = new Random();  			// generate random numbers 
		int num = random.nextInt(50,100)	;// to control the values 
		
		System.out.println(num);
	}

}
