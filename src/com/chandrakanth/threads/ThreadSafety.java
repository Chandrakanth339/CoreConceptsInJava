package com.chandrakanth.threads;

import com.chandrakanth.threads.ProcessingThread;

public class ThreadSafety {

	/*public static void main(String[] args) throws InterruptedException */
	public ThreadSafety() throws InterruptedException{

		ProcessingThread pt = new ProcessingThread();
//		ProcessingThread2 pt2 = new ProcessingThread2();
		Thread t1 = new Thread(pt, "t1");
		Thread t2 = new Thread(pt, "t2");
		Thread t3 = new Thread(pt, "t3");
		Thread t4 = new Thread(pt, "t4");
		
		t1.start();		
		
		
		t3.start();
		t2.start();
		t4.start();
	}

}

class ProcessingThread implements Runnable {
	private int count;

	@Override
	public void run() {
	
            processSomething();
        	
		}


	private /*static*/ /*synchronized*/ void processSomething() {
		// processing some job
		try {
			for(int i=1;i<5;i++){
				Thread.sleep(50);
				System.out.println(i);
    		}
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class ProcessingThread2 implements Runnable {

	@Override
	public void run() {
	
            processSomething(1);

		}
	


	private static synchronized void processSomething(int j) {
		// processing some job
		try {
			
			for(;j<5;j++){
				Thread.sleep(100);
				System.out.println(j);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
