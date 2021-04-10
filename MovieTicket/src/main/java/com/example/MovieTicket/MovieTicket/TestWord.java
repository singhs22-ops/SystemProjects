package com.example.MovieTicket.MovieTicket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestWord {

	public TestWord() {
		// TODO Auto-generated constructor stub
		createset();
		outputSentence("youdoubleme");
	}
	
	Set<String> set1 = new HashSet<String>() ;
	
	//{ “you”, “a”, “are”, “hero”, “i”, then, “areah”,
	public void createset() {
		set1.add("you");
		set1.add("double");
		set1.add("me");
		set1.add("hero");
		set1.add("i");
		set1.add("then");
		set1.add("areah");
		System.out.println(set1);
		
	}
	
	public boolean findWord(String str) {
		for(String a: set1) {
			if(a.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	public String outputSentence(String input)
	{
		int i=0;int j; int k;
		String returnStr = new String();
		String news = new String("");
		boolean found = false;
		
		while(i<input.length()) {
			news = news+ input.charAt(i);
			if(set1.contains(news)) {
				returnStr+= news+" ";
				
				String newStr[] = input.split(news,2);
						news = "";
				input = newStr[1];
				i=-1;
			}			
			
				System.out.println(news+"value of i:: "+i);
				
				System.out.println(returnStr);
				i++;
			
		}
		return returnStr;
		
	}


}
