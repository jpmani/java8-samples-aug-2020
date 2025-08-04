/**
 * 
 */
package com.java8.pgms.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Get the top 3 highest numbers from a list using Stream API.
 */
public class FindTop3NbrsByStreams {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(6);
		intList.add(2);
		intList.add(4);
		intList.add(1);
		intList.add(7);
		
		// Sort in descending order and get top 3
        List<Integer> top3Numbers = intList.stream()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("Top 3 highest numbers: " + top3Numbers);
		
	}

}
