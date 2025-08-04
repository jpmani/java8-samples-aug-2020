/**
 * 
 */
package com.java8.pgms.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Implement `Predicate` to filter a list of strings that start with a given prefix.
 */
public class ImplPredicateAndFilterStrByPrefix {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("Ram");
		strList.add("Siva");
		strList.add("Riya");
		strList.add("Gowtham");
		strList.add("Murali");

		Predicate<String> strPredi = prefix -> prefix.startsWith("G");
		List<String> prefixList = strList.stream().filter(strPredi).collect(Collectors.toList());
		System.out.println("prefixList:"+prefixList);
	}
}