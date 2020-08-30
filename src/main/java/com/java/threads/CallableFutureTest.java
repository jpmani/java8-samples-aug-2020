package com.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// FutureTask is a concrete class that
		// implements both Runnable and Future
		FutureTask[] randomNbrFutureTask = new FutureTask[5];

		for (int i = 0; i < 5; i++) {
			Callable callable = new CallableInterfaceExample();

			// Create the FutureTask with Callable
			randomNbrFutureTask[i] = new FutureTask(callable);

			// As it implements Runnable, create Thread with FutureTask
			Thread myThread = new Thread(randomNbrFutureTask[i]);
			myThread.start();

			//for (int j = 0; j < 5; j++) {
				// As it implements Future, we can call get()
					System.out.println(randomNbrFutureTask[i].get());
					// This method blocks till the result is obtained
					// The get method can throw checked exceptions
					// like when it is interrupted. This is the reason
					// for adding the throws clause to main
			//}
		}
	}
}