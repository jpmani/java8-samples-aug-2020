/**
 * 
 */
package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author MANIKANDAN J
 *
 */
public class ComparatorSample {
	
	public static void main(String[] args) {
		
	List<EmployeeOne> empList = new ArrayList<>();
	empList.add(new EmployeeOne(500, "Riya", "CSE"));
	empList.add(new EmployeeOne(200, "Nila", "IT"));
	empList.add(new EmployeeOne(100, "Isai", "Mech"));
	empList.add(new EmployeeOne(300, "Gowtham", "EEE"));
	empList.add(new EmployeeOne(400, "Anoop", "ECE"));
	
	System.out.println("Sorted by EmpId:");
	EmpIdComparator empIdComparator = new EmpIdComparator();
	Collections.sort(empList, empIdComparator);
	for (EmployeeOne employeeOne : empList) {
		System.out.println(employeeOne.getEmpId() + " : " +
							employeeOne.getEmpName() + " : " +
							employeeOne.getDept());
	}
	System.out.println("\nSorted by DeptName");
	EmpDeptComparator deptComparator = new EmpDeptComparator();
	Collections.sort(empList, deptComparator);
	for (EmployeeOne employeeOne : empList) {
		System.out.println(employeeOne.getEmpId() + " : " +
							employeeOne.getEmpName() + " : " +
							employeeOne.getDept());
		}
	}
}
