package com.thread;

class MyThread2 extends Thread {
	MyThread2(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class RunInsteadOfStartDemo {
	public static void main(String args[]) {
		MyThread2 m = new MyThread2("Jaison");
		m.run();
		//m.start();
	}
}
