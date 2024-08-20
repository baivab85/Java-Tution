package main;

public class Person {
	private String name;
	private int age;
	
	public Person(){ // default constructor, no args constructor
		System.out.println("Object Created");
	}
	
	public Person(String name, int age) { //all args constructor
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
