package abstraction.interf;

public interface Person {
	

	

	void show();
	void name();
	void age();
	
	default void test() {
		System.out.println("Hello testing person");
	}

	
}
