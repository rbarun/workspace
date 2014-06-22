package com.abCube.example;

public class DVD {
	String title;
	String genre;
	String year;
	Boolean onLoan = true;
	
	public Boolean loanToFriend(){
		return onLoan;
	}
	
	
	
	// ------- will expalain it later 
	
	DVD (String title, String genre, String year){
		this.title = title;
		this.genre = genre;
		this.year = year;
		
		
	}
	public String getTitle(){
		return title;
	}
	public String getGenre(){
		return genre;
	}
	public String getYear(){
		return year;
	}

}
