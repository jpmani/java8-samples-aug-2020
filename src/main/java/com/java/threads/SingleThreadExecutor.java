package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task1...");
			}
		};
		Runnable task2 = () -> { 
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task2...");
		};
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.shutdown();
	}
}
