package multithreading;

public class TimerThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Timer");
		}
	}

	
}
