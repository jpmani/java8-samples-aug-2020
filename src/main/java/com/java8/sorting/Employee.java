/**
 * 
 */
package com.java8.sorting;

/**
 * @author MANIKANDAN J
 *
 */
public class Employee {

	private int id;
	private long salary;
	
	/**
	 * @param id
	 * @param salary
	 */
	public Employee(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
}
