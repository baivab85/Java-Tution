package main.exam2;

public class StaticBlock {
	
	static {
		System.out.println("Hello World");
//		connecting to database
	}
	
	static {
		System.out.println("Hello World 2");
	}
	
	public static void main(String[] args) {
//		new TestStaticBlock();
//		insert data to database
		
		System.out.println("Main");
	}

	
	
	static {
		System.out.println("Hello World 3");
	}
	
}
