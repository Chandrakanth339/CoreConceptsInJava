package com.pluralsight.threads;

import java.util.concurrent.TimeUnit;

public class BartenderThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Bartender: Let me sleep !");

		while (true) {
			boolean b = Thread.interrupted();

			if (b) {
				System.out.println("I am sleeping !! Is anyone waiting for me out there !?");
			}
			try {
			
				TimeUnit.SECONDS.sleep(5);

			} catch (InterruptedException e) {
				System.out.println("My sleep was interrupted :(");
				new Thread().interrupt();
			}
		}

	}

}
