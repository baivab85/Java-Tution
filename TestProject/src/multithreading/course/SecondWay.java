package multithreading.course;

import java.util.List;
import java.util.Vector;

class TestThread implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<100; i++) {
			System.out.println(i);
		}
		
	}	
}

public class SecondWay {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		Thread t2 = new Thread(tt);
		t.start();
		t2.start();
	}
}
