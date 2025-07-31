/**
 * 
 */
package com.java.exception;

/**
 * @author MANIKANDAN J
 *
 */
public class Parent {
	
	// parent class method throws Nullpointer exception
	public void test() throws NullPointerException {
		String str = null;
		System.out.println("Parent:"+str.toString());
	}
	
	public void test1() throws Exception {
		String str = null;
		System.out.println("Parent:"+str.toString());
	}

}
