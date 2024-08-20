package multithreading;

public class Main {
	
	public static void video() throws InterruptedException {
		for(int i = 0 ; i<10; i++) {
			Thread.sleep(1000);
			System.out.println("Video");
		}
	}
	
	public static void audio() throws InterruptedException {
		for(int i = 0 ; i<10; i++) {
			Thread.sleep(1000);
			System.out.println("Audio");
		}
	}
	
	public static void timer() throws InterruptedException {
		for(int i = 0 ; i<10; i++) {
			Thread.sleep(1000);
			System.out.println("Timer");
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
//		process vs thread
//      CPU - central processing unit
		
//		process - single thread/ multiple thread
		
//		single thread - 1 default
//		video -  audio - timer
//		System.out.println(Thread.currentThread());
//		
//		video();
//		audio();
//		timer();
		
		
		VideoThread  video = new VideoThread();
		AudioThread audio = new AudioThread();
		TimerThread timer = new TimerThread();
		
		video.start();
		audio.start();
		timer.start();
		
		
//		MultiThreading:
		
		
		
	}
}
