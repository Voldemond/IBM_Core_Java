package com.ibm.demo.day3.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics { 

	public static void main(String[] args) {

//		ArrayList<String> friends = new ArrayList<String>();
		ArrayList<String> friends = new ArrayList<>();
		
		List<String> friends2 = new ArrayList<>();
		
		

//		System.out.println(friends.size());
//		System.out.println(friends);
		friends.add("Sonu");
		friends.add("Monu");
		friends.add("Tonu");
		
		
		System.out.println(friends.size());
	//	System.out.println(friends);
//		friends.add(10.25);
//		friends.add(false);
//		friends.add(null);
	//	System.out.println(friends.size());
	//	System.out.println(friends);
		
	System.out.println();
		
		friends.trimToSize();
		friends.get(0);
//		friends2.trim
		
		friends2.add("kunal");
		friends2.add("mohit");
		friends2.get(0);
		friends2.remove("kunal");
		friends2.size();
		
		System.out.println(friends2.size());
		System.out.println(friends2);

	}

}