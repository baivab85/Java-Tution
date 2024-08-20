package main;

public class Dog extends Animal{
	
	int anythingExtra;

	public int getAnythingExtra() {
		return anythingExtra;
	}

	public void setAnythingExtra(int anythingExtra) {
		this.anythingExtra = anythingExtra;
	}
	
	public void display() {
		System.out.println("Dog "+ this.getNumberOfEyes()+","+ this.getNumberOfLegs());
	}
	
	
	

}
