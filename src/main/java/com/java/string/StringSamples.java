/**
 * 
 */
package com.java.string;

/**
 * @author MANIKANDAN J
 *
 */
public class StringSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String emp1 = "manik";
		String emp2 = "mani";
		String emp3 = emp1;
		
		System.out.println("by equals1:"+emp1.equals(emp2));
		System.out.println("by equals oper1:"+emp1 == emp2);
		
		System.out.println("by equals2:"+emp3.equals(emp2));
		System.out.println("by equals oper2:"+emp3 == emp2);
	}

}
