package com.ibm.demo.day2.InheritDemo;

public class Phone {

}

class BasicPhone{
	
	public void call() {
		
		System.out.println("Calling...");
	}
	
	public void sms() {
		
	}
}

class FeaturePhone extends BasicPhone{
	
	public void music() {
		System.out.println("Playing....");
	}
}

class SmartPhone extends FeaturePhone{
	@Override 
	public void music()	{
		System.out.println("Playing dolby...");
	}
}
