package com.thread;

public class ThreadDemo1 {
	
	public static void main(String[] args) {
		Demo dd = new Demo();
		dd.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+i+"m");
		}
	}

}
