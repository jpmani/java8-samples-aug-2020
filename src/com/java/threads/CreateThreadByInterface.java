package com.java.threads;

public class CreateThreadByInterface implements Runnable {
	
	@Override
	public void run() {
		 System.out.println("Thread" 
				 +Thread.currentThread().getId() + "is running:");
	}
	
	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
		Thread myThread = new Thread(new CreateThreadByInterface());
		myThread.start();
		}
	}

}
