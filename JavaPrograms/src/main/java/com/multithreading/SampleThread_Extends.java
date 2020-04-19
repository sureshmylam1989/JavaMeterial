package com.multithreading;

public class SampleThread_Extends extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SampleThread_Extends st1 = new SampleThread_Extends();
		SampleThread_Extends st2 = new SampleThread_Extends();
		SampleThread_Extends st3 = new SampleThread_Extends();
		
		st1.start();
//		try {
//			st1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		st2.start();
		st3.start();
		
		System.out.println(st1.getName());
	}

}
