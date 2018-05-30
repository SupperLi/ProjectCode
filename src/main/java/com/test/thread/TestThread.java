package com.test.thread;

public class TestThread {
	
	public static void main(String[] args) {
		
		
		DemoThread dt = new DemoThread();
		
		Thread t1 = new Thread(dt);
		
		Thread t2 = new Thread(dt);
		
		Thread t3 = new Thread(dt);
		
		Thread t4 = new Thread(dt);
		
		Thread t5 = new Thread(dt);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
	
}
