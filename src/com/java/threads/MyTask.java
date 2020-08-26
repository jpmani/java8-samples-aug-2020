package com.java.threads;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("My Task Started...");
		
		System.out.println("My Task Ended...");
	}

}
