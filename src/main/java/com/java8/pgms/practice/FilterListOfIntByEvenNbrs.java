/**
 * 
 */
package com.java8.pgms.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Filter a list of integers to get only even numbers using a lambda.
 *
 */
public class FilterListOfIntByEvenNbrs {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(3);
		intList.add(8);
		intList.add(5);
		// even numbers
		List<Integer> filteredList = intList.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
		// odd numbers
		//List<Integer> filteredList = intList.stream().filter(even -> even % 2 != 0).collect(Collectors.toList());
		System.out.println("filteredList:"+filteredList);
	}
}