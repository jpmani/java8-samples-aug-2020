package com.java8.pgms.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author MANIKANDAN J
 * Write a lambda expression to sort a list of strings by their length
 */
public class SortListOfStringsByLength {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("Ram");
		strList.add("Siva");
		strList.add("Riya");
		strList.add("Gowtham");
		strList.add("Murali");
		
		// below code is currently filtering the list, not sorting it.
		//List<String> sortedList = strList.stream().filter(str -> str.length() > 3).collect(Collectors.toList());
		
		// type 1 - lambda expression to sort a list of strings by their length
		// List<String> sortedList = strList.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
		//		.collect(Collectors.toList());
		
		// type 2 - lambda expression to sort a list of strings by their length
		//List<String> sortedList = strList.stream().sorted(Comparator.comparingInt(String::length))
		//		.collect(Collectors.toList());
		
		// type 3 - (Filter + Sort)
		List<String> sortedList = strList.stream().filter(str -> str.length() > 3)
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		
		System.out.println("sortedList:"+sortedList);	
	}
}