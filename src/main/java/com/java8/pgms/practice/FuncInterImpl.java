/**
 * 
 */
package com.java8.pgms.practice;

/**
 * @author MANIKANDAN J
 * Create a functional interface and implement it using a lambda.
 *
 */
public class FuncInterImpl {

	@FunctionalInterface
	interface FuncInter {
		// only one abstract method is allowed in functional interface. but multiple default and static methods are allowed.
		//abstract void print();
		abstract int operate(int a, int b);
	}
	
	public static void main(String[] args) {
		// Type 1
		//FuncInter funcInter = () -> System.out.println("This is Functional Interface Implementation:");
		//funcInter.print();
		// Type 2
		FuncInter funcInter = (a,b) -> (a+b);
		System.out.println("Total:"+funcInter.operate(5, 5));
	}

}
