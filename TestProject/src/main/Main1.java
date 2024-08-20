package main;

public class Main1 {
	
	public static void main(String[] args) {
		//Person p = new Person();
//		p.setName("Subhradeep");
//		p.setAge(23);
		
//		Person p = new Person("Subhradeep", 23);
//		System.out.println(p.getName()+" "+p.getAge());
		
		
//		class, object, getter, setter, constructor
		
// inheritance 
// encapsulation
// abstruction
// polymorphism 
		
//		
//		1. Encapsulation
//		Definition: Bundling data (attributes) and methods (functions) that operate on that data within a single unit called a class.
//		Purpose: Protects data from accidental modification, increases code reusability, and improves code maintainability.
//		Example: A Car class encapsulates attributes like color, model, and year, along with methods like start(), stop(), and accelerate().
		
//		2. Inheritance
//		Definition: Creating new classes (derived classes) that inherit properties and behaviors from existing classes (base or parent classes).
//		Purpose: Promotes code reusability, creates hierarchical relationships between classes, and allows for specialization.
//		Example: A SportsCar class can inherit properties from a Car class, but add specific attributes like turbo and methods like drift().
		
		Dog d = new Dog();
		
		d.setNumberOfEyes(2);
		d.setNumberOfLegs(4);
		d.setAnythingExtra(100);
		d.display();
		
//		System.out.println("Dog " + d.getNumberOfEyes() + " "+ d.getNumberOfLegs() + " " + d.getAnythingExtra());
		
		
		Snake s = new Snake();
		
		s.setNumberOfEyes(2);
		s.setNumberOfLegs(5);
		s.display();
		
//		System.out.println("Snake " + s.getNumberOfEyes() + " "+ s.getNumberOfLegs());
		
		
		
//		Animal a = new Animal(2,4);
		
//		3. Polymorphism
//		Definition: The ability of objects of different types to be treated as if they were of the same type.
//		Purpose: Enables writing flexible and reusable code, allows for dynamic method dispatch, and supports method overloading and overriding.
//		Example: Different animals (dogs, cats, birds) can all be treated as Animal objects, and their specific behaviors can be invoked through polymorphism.
		
		
		// runtime, compile-time - overriding, overloading
		
		// compile time
		Calculator c = new Calculator();
		int result = c.sum(12, 15, 13);
		System.out.println(result);
		
		
		//runtime
//		Dog d = new Dog();
//		
//		d.setNumberOfEyes(2);
//		d.setNumberOfLegs(4);
//		d.setAnythingExtra(100);
//		d.display();
//		
//		
//		Snake s = new Snake();
//		
//		s.setNumberOfEyes(2);
//		s.setNumberOfLegs(5);
//		s.display();
		
		
//		4. Abstraction
//		Definition: Simplifying complex systems by focusing on essential features and hiding unnecessary details.
//		Purpose: Improves code readability, reduces complexity, and promotes modularity.
//		Example: A Car class can be abstracted to provide methods like start() and stop(), without exposing the internal details of the engine or transmission.
//		
		
	}

}
