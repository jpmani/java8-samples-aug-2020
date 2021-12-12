package com.hacker.rank.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalStatements {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		if (N % 2 == 0) {

			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");

			} else if (N >= 6 && N <= 20) {
				System.out.println("Weird");

			} else {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}
		bufferedReader.close();
	}
} 
