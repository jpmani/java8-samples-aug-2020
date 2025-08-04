package com.java.collection;

public class EmployeeOne implements Comparable<EmployeeOne>{
	
	public EmployeeOne(int empId, String empName, String dept) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	
	@Override
	public int compareTo(EmployeeOne empOne) {
		return this.empId - empOne.empId;
	}
	
	int empId;
	String empName;
	String dept;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
}