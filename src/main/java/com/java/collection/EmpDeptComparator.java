package com.java.collection;

import java.util.Comparator;

public class EmpDeptComparator implements Comparator<EmployeeOne>{
	
	@Override
	public int compare(EmployeeOne empObj1, EmployeeOne empObj2) {
		return empObj1.getEmpName().compareTo(empObj2.getEmpName());
	}
}
