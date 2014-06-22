package com.abCube.example;

public class HelloWorld {

	public static void main(String[] args) {
		
		// instantiate ...
		DVD myDvd1 = new DVD("Shrek", "comedy", "2001");
		DVD myDvd2 = new DVD("Spider Man2", "action", "2004");
		
		// now I am using instances
		System.out.println("My first dvd title : " + myDvd1.getTitle());
		System.out.println("My SECOND dvd title : " + myDvd2.getTitle());
		
		System.out.println("Can I load this myDvd1 : " + myDvd1.loanToFriend());

	}

	
	
	// ----> attributes
}
