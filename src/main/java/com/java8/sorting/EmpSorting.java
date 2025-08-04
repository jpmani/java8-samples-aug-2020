/**
 * 
 */
package com.java8.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author MANIKANDAN J
 * Given an employees list, sort employees based on
 * their salaries in desc order? and fetch top 3 salaried emp's,
 * and fetch all emp's having salary less than 3rd top salary.
 */
public class EmpSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(100, 1000));
		empList.add(new Employee(432, 9843));
		empList.add(new Employee(150, 1500));
		empList.add(new Employee(200, 2796));
		empList.add(new Employee(125, 3345));
		empList.add(new Employee(345, 7584));
		empList.add(new Employee(135, 5654));
		
		//just reverse the object. ex: e2-e1 for desc order.
		List<Employee> sortedEmpList = empList.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
				//.limit(3) // use limit method to fetch only limited emp's
				.skip(3) // use skip method to skip upto mentioned number and fetch remaining emp's
				.collect(Collectors.toList());
		//Asc order
		//List<Employee> sortedEmpList = empList.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).collect(Collectors.toList());
		System.out.println("Sorted Emp List:" +sortedEmpList);
	}

}
