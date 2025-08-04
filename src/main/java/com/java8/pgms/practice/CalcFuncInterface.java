package com.java8.pgms.practice;

/**
 * @author MANIKANDAN J
 * Write a custom functional interface for a calculator and use it with lambdas.
 */
@FunctionalInterface
interface Calc {
	int calc(int a, int b);
}

public class CalcFuncInterface {

	public static void main(String[] args) {
		Calc add = (a,b) -> (a+b);
		Calc multi = (a,b) -> (a*b);
		Calc div = (a,b) -> {
			if (b==0) throw new ArithmeticException("Division by zero:");
			return a/b;
		};
		Calc sub = (a,b) -> (a-b);
		
		System.out.println("Add:"+add.calc(3,7));
		System.out.println("Multi:"+multi.calc(3,7));
		System.out.println("Div:"+div.calc(7,2));
		System.out.println("Sub:"+sub.calc(7,3));
	}
}