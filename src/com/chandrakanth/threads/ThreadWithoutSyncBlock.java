package com.chandrakanth.threads;

public class ThreadWithoutSyncBlock {
	public static void main(String[] args) {
		One fnew = new One();
		Two ss = new Two(fnew, "welcome");
		Two ss1 = new Two(fnew, "new");
		Two ss2 = new Two(fnew, "programmer");
	}

}

class One {
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Two extends Thread {
	String msg;
	One fobj;

	Two(One fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		fobj.display(msg);
	}
}
