package multithreading.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main extends Thread{
	
	static List<Integer> list = new Vector<Integer>();
	
		
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			list.add(i);
		}
	}


	public static void main(String[] args) throws InterruptedException {
		Main obj = new Main();
		obj.start();
		Main obj2= new Main();
		obj2.start();
		Thread.sleep(2000);
		System.out.println(list.size());
	}
}
