package exceptionCodes.custom;

public class TestingCustomException {
	public static void display(Integer age) {
		
		if(age>=18)
		System.out.println("Display");
		else {
			MyCustomException exception = new MyCustomException("You are not allowed");
			throw exception;
		}
	}
}
