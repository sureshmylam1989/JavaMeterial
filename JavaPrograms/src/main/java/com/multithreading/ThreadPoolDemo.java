package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Runnable runn = new ThreadPool("worker" + i);
			ex.execute(runn);
		}
		ex.shutdown();
		while (!ex.isTerminated()) {

		}
		System.out.println("all done");
	}
}
