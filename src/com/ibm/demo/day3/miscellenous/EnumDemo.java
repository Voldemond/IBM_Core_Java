package com.ibm.demo.day3.miscellenous;

import java.time.DayOfWeek;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		
		DayOfWeek today = DayOfWeek.MONDAY; 
		System.out.println(today);
		
		today = DayOfWeek.FRIDAY ;
		
		System.out.println(today);
	//	today = "DryDay";
	}
}
