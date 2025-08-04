/**
 * 
 */
package com.java.exception;

import java.io.IOException;

/**
 * @author MANIKANDAN J
 *
 */
public class Child extends Parent {
	
	// child class overridden method throws RT exception, 
	//its possible only on Unchecked exception scenario.
	public void test() throws RuntimeException {
		int x = 50/0;
		System.out.println("Child:"+x);
	}
	
	public void test1() throws IOException {
		int x = 50/0;
		System.out.println("Child:"+x);
	}
}
