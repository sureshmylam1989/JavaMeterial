package com.multithreading;

public class ThreadPool implements Runnable{

	private String name;

	public ThreadPool(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread is "+Thread.currentThread().getName()+ "value " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
