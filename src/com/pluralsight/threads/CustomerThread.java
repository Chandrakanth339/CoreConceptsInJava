package com.pluralsight.threads;

import java.util.concurrent.TimeUnit;

public class CustomerThread implements Runnable {

	private Thread barThread;
	private String customerName;
	private int waitTime;

	public CustomerThread(/* Thread barThread, */ String customerName, int waitTime) {
		// this.barThread = barThread;
		this.customerName = customerName;
		this.waitTime = waitTime;
	}

	@Override
	public void run() {
		System.out.println(customerName + " Doesn't seem to be having any one around !");

		try {
			TimeUnit.SECONDS.sleep(waitTime);

		}
		// Once the InterruptedException is caught, then the thread
		// state will be back to uninterrupted state
		catch (InterruptedException e) {

			/*
			 * To check the current status of thread interruption, whether
			 * thread interruption is true or false
			 */
			System.out.println(Thread.currentThread().getId());
			System.out.println("Interrupted Thread");

		}

	}

}
