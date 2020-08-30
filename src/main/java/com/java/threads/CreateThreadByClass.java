package com.java.threads;

public class CreateThreadByClass extends Thread {
	
	public void run() {
		 System.out.println("Thread" 
				 +Thread.currentThread().getId() + "is running:");
	}
	
	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			CreateThreadByClass myThread = new CreateThreadByClass();
			myThread.start();
		}
	}
}
