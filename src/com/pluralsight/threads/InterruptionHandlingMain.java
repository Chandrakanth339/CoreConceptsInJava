package com.pluralsight.threads;

import java.util.concurrent.TimeUnit;

public class InterruptionHandlingMain {

	public static void main(String[] args) {

		/*
		 * BartenderThread bartender = new BartenderThread(); Thread barThread =
		 * new Thread(bartender, "barThread");
		 * 
		 * barThread.start();
		 */
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {

		}
		int customerCount = 5;

		for (int i = 1; i <= customerCount; i++) {

			String customerName = "Customer " + i;
			CustomerThread customer = new CustomerThread(/* barThread, */customerName, 5);
			Thread th = new Thread(customer, "Customer");

			th.start();

			th.interrupt();

		}
	}

}
