package com.chandrakanth.threads;

public class ThreadMain {
	int a1 = 0;
	int a2 = 0;

	public static void main(String[] args) {

		/*
		 * Thread Running - Method 1 - Ulsing Thread Instantiation with a class
		 * that extends Thread Class
		 */

		Thread threadExtender = new ThreadExtender();
		threadExtender.start();
		// Method 1 ends...

		/*
		 * Thread Running - Method 2 - Using Thread Instantiation with a class
		 * that implements Runnable Interface
		 */
		Thread runnableImpl = new Thread(new RunnableImplementor());
		runnableImpl.start();

		/*
		 * Thread Running - Method 3 - Using Thread Instantiation with anonymous Runnable Interface
		 * implements Runnable Interface
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Method 3 - Running Thread using Anonymous Runnable interface");

			}

		};

		Thread threadAnonymous = new Thread(runnable);
		threadAnonymous.start();

		// Method 4 - Running Thread using Anonymous Thread Class
		Thread threadAnonymousThread = new Thread("New Thread") {

			public void run() {

				System.out.println("Method 4 - Running Thread using Anonymous Thread Class");

			}

		};

		// Always Thread name will be called first before Thread start method...
		threadAnonymousThread.start();

		// Thread Safety Implementation
//		try {
//			ThreadSafety thrSafety = new ThreadSafety();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// Volatile Threads
		/*PropertyObject probObject = new PropertyObject();*/

/*		Thread volatileThread1 = new Thread(new VolatileThread1(), "vol1");
		Thread volatileThread2 = new Thread(new VolatileThread2(), "vol2");

		volatileThread1.start();
		volatileThread2.start();
*/
	}

}
