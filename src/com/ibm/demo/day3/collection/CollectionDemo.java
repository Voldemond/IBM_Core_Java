package com.ibm.demo.day3.collection;

import java.util.ArrayList;

public class CollectionDemo {

	
	public static void main(String[] args) {
		
		//String[] str = {"Sonu", "Monu", "Tonu"};
		
//		for(String s : str)	
//			System.out.println();
//		
//		Str[2 ]=
		
		ArrayList  friends = new ArrayList();
		
		System.out.println(friends.size());
		System.out.println(friends);
		friends.add("Monu");
		friends.add("Sonu");
		
		System.out.println(friends.size());
		System.out.println(friends);
		
		friends.remove(2);
		System.out.println(friends);
		
		System.out.println(friends);
		friends.remove("Zonu");
		System.out.println(friends.size());
		System.out.println(friends);

	}
}
