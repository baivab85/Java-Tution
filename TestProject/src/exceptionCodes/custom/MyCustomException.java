package exceptionCodes.custom;

public class MyCustomException extends RuntimeException{
	public MyCustomException() {
		// TODO Auto-generated constructor stub
		super("Exception from custom class");
	}
	
	public MyCustomException(String message) {
		super(message);
	}
}
