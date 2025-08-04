/**
 * 
 */
package com.java8.pgms.practice;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Find the first non-repeated character in a string using streams.
 */
public class FindFirstNonRepeatCharByStreams {

	public static void main(String[] args) {
		
		String input = "abcdABCDxyzRiya";

		Optional<Character> firstNonRepeated = input.chars()
	            .mapToObj(c -> (char) c)
	            .filter(ch -> Collections.frequency(
	                input.chars()
	                     .mapToObj(i -> (char) i)
	                     .collect(Collectors.toList()), ch) == 1)
	            .findFirst();
		
		/** another way
		 *  // Step 1: convert input to a List<Character> once
        List<Character> chars = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toList());

        // Step 2: Stream through and find the first non-repeated character
        Optional<Character> firstNonRepeated = chars.stream()
            .filter(ch -> Collections.frequency(chars, ch) == 1)
            .findFirst();
		 */

	        // Java 8: Use isPresent() and get()
	        if (firstNonRepeated.isPresent()) {
	            System.out.println("First non-repeated character: " + firstNonRepeated.get());
	        } else {
	            System.out.println("No non-repeated character found");
	        }	
	}
}