/**
 * 
 */
package com.java8.streams;

import java.util.stream.IntStream;

/**
 * @author MANIKANDAN J
 *
 */
public class IntegerStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. IntStream
		IntStream
		.range(1, 11)
		.forEach(System.out::print);
		System.out.println("\n");
		// 2. IntStream with skip
		IntStream
		.range(1, 11)
		.skip(5)
		.forEach(x -> System.out.println(x));
		System.out.println("\n");
		// 3. IntStream with sum
		int sum = IntStream
		.range(1, 6)
		.sum();
		System.out.println(sum);
	}

}
