package com.java8.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;
/**
 * Given a list of employees, you need to filter all the employee 
 * whose age is greater than 20 and print the employee names.
 * (Java 8 APIs only)
 */
public class StreamFilterNameByMaxVal {

	public static void main(String[] args) {
		
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeFilteredList = employeeList
											.stream()
											.filter(emp -> emp.getAge() > 20)
											//.map(Employee::getName) // calling by method reference
											.map(emp -> emp.getName()) // both are same and will work
											.collect(Collectors.toList());
		employeeFilteredList.forEach(name -> System.out.println(name));
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
