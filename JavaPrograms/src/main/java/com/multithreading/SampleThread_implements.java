package com.multithreading;

public class SampleThread_implements implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name is :"+Thread.currentThread().getName()+ " "+ Thread.currentThread().getPriority());

	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new SampleThread_implements());
		Thread t2 = new Thread(new SampleThread_implements());
		t1.setName("Suresh");
		t2.setName("Mylam");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();	
		t2.start();	
	}

}
