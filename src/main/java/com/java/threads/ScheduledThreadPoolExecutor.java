package com.java.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {

	public static void main(String[] args) {
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		MyTask myTask = new MyTask();
		//Executes myTask after 5 secs delay
		scheduledExecutorService.schedule(myTask, 5, TimeUnit.SECONDS);
		//Executes myTask periodic for every 3 secs delay
		//scheduledExecutorService.scheduleAtFixedRate(myTask, 0, 3, TimeUnit.SECONDS);
		scheduledExecutorService.shutdown();
	}
}
