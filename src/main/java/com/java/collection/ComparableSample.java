package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A comparable object is capable of comparing itself with another object. 
 * The class itself must implements the java.lang.Comparable interface to compare its instances. 
 * Consider a EmployeeOne class that has members empId, empName, dept. Suppose we wish to 
 * sort a list of EmployeeOne based on empId. We can implement the Comparable interface with the 
 * Movie class, and we override the method compareTo() of Comparable interface.
 */
public class ComparableSample {

	public static void main(String[] args) {
		
		List<EmployeeOne> empList = new ArrayList<>();
		empList.add(new EmployeeOne(500, "Riya", "CSE"));
		empList.add(new EmployeeOne(200, "Nila", "IT"));
		empList.add(new EmployeeOne(100, "Isai", "Mech"));
		empList.add(new EmployeeOne(300, "Gowtham", "EEE"));
		empList.add(new EmployeeOne(400, "Anoop", "ECE"));
		Collections.sort(empList);
		System.out.println("Emp's after sorting:");
		
		for (EmployeeOne employeeOne : empList) {
			System.out.println(employeeOne.getEmpId() + " : " +
								employeeOne.getEmpName() + " : " +
								employeeOne.getDept());
		}
	}
}