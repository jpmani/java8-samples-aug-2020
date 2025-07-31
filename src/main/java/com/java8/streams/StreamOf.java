package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author MANIKANDAN J
 *
 */

public class StreamOf {

	public static void main(String[] args) {
		
		// 1. Sorted as alphabetic order using findFirst
		Stream.of("Riya","Nila","Isai","Gowtham","Anubi")
		.sorted()
		.findFirst()
		.ifPresent(x -> System.out.println(x));
		System.out.println("\n");
		// 2. Stream from Array, sort, filter and print
		String[] names = {"Riya","Nila","Isai","Gowtham","Anubi","Ramu","Rajesh","Ravi"};
		Arrays.stream(names) // same as Stream.of()
		.filter(x -> x.startsWith("R"))
		.sorted()
		.forEach(name -> System.out.println(name)); // alternate System.out::println
		System.out.println("\n");
		// 3. Avg of squares of an int array
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
	}

}
