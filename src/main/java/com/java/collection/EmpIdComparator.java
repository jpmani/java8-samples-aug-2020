package com.java.collection;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<EmployeeOne>{
	
	@Override
	public int compare(EmployeeOne empObj1, EmployeeOne empObj2) {
		if (empObj1.getEmpId() < empObj2.getEmpId()) return -1;
        if (empObj1.getEmpId() > empObj2.getEmpId()) return 1;
        else return 0;
	}
}