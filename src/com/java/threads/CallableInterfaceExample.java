package com.java.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableInterfaceExample implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		Random random = new Random();
		Integer randomNbr = random.nextInt(5);
		Thread.sleep(randomNbr * 1000);
		return randomNbr;
	}
}
