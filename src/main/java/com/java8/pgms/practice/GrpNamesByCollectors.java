/**
 * 
 */
package com.java8.pgms.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Group a list of people by their city using `Collectors.groupingBy()`.
 */
public class GrpNamesByCollectors {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
	            new Person("Ram", "Chennai"),
	            new Person("Riya", "Chennai"),
	            new Person("Mani", "Thuraiyur"),
	            new Person("Anub", "Thuraiyur"),
	            new Person("Nila", "Bangalore")
	        );

	        Map<String, List<Person>> groupedByCity = people.stream()
	            .collect(Collectors.groupingBy(Person::getCity));

	        groupedByCity.forEach((city, persons) -> {
	            System.out.println(city + ": " + persons);
	        });
	}

}
