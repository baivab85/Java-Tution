package multithreading.course;

public class ThirdWay {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 1; i < 100; i++)System.out.println(i);
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 100; i++) {
					System.out.println(i);
				}
			}
			
		});
		t.start();
		t2.start();
		
		
//		functional interface, lambda expression
	}
}
