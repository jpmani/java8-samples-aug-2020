package com.hacker.rank.samples;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int j = 0;
		double db = 0.0;
		//String str = "is the best place to learn and practice coding!";
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		
		j = scan.nextInt();
		db = scan.nextDouble();
		String str = "";
		scan.nextLine();
		str = scan.nextLine();
		
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + j);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + db);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		//s.concat(str);
		System.out.println(s+str);

		scan.close();
	}

}
