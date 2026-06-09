package com.ibm.demo.day4.threads;

class Worker implements Runnable{
	
	public void run() {
		method();
	}
	
	public void method() {
		
		for(int i = 1 ; i <=3 ; i++) {
			
			System.out.println(Thread.currentThread().getName()+"Working...");
		}
	}

}
