package main.exam1;

public class Main {
	public static void main(String[] args) {
		
		SamsungASeries s = new SamsungA23();
		
		System.out.println(s.getModel());
		System.out.println(s.getPrice());
		System.out.println(s.getCameraMP());
		
		System.out.println(s);
	}
}
