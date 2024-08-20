package main;

public class Animal {
	
	private int numberOfEyes;
	private int numberOfLegs;
	
	
	public int getNumberOfEyes() {
		return numberOfEyes;
	}
	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	
	public Animal(int numberOfEyes, int numberOfLegs) {

		this.numberOfEyes = numberOfEyes;
		this.numberOfLegs = numberOfLegs;
	}
	
	public Animal() {

	}
	
	public void display() {
		System.out.println("Animal "+this.numberOfEyes+","+this.numberOfLegs);
	}

	
	

}
