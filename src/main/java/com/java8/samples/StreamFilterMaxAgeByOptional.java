package com.java8.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import com.java8.pojo.Employee;
/**
 * Given a list of employees, find maximum age of employee
 * (Java 8 APIs only)
 */
public class StreamFilterMaxAgeByOptional {

	public static void main(String[] args) {
		
		List<Employee> employeeList = createEmployeeList();
		OptionalInt filteredAge = employeeList.stream()
										   .mapToInt(emp -> emp.getAge()) // calling by method reference
										   //.mapToInt(Employee::getAge) // both are same and will work
										   .max();
											
		if(filteredAge.isPresent()) {
			System.out.println(filteredAge.getAsInt());
			}
		}
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
 
		return employeeList;
	}

}
