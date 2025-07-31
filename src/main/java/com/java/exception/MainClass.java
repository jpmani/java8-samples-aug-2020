/**
 * 
 */
package com.java.exception;

/**
 * @author MANIKANDAN J
 * We can throw any Runtime Exception from overrided method irrespective of super class method 
 * but the same is not true with Checked Exception- In this case the scope of overrided method 
 * is always less than super class method.
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent c = new Child();
		c.test();
		
		Parent c1 = new Child();
		try {
			c1.test1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
