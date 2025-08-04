package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class DifferentOperationsWithStreams {

	public static void main(String[] args) {
		
		// 1. Streams from List, filter and print
		List<String> people = Arrays.asList("riya","Nila","Isai","Gowtham","Anubi","ramu","Rajesh","ravi");
		people
		.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("r"))
		.forEach(System.out::println);
	}

}
