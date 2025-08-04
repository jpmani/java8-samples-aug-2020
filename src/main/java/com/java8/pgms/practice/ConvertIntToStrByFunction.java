/**
 * 
 */
package com.java8.pgms.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Use `Function` to convert a list of integers to their string representations.
 */
public class ConvertIntToStrByFunction {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(3);

		Function<Integer, String> intToStr = Object::toString;
		List<String> strList = intList.stream().map(intToStr).collect(Collectors.toList());
		System.out.println("String List: " + strList);
	}
}