package revesion;

import main.Calculator;
import revesion.data.FilmStarRepresentation;
import revesion.data.HumanRepresentation;
import revesion.data.polymorphism.Bike;
import revesion.data.polymorphism.Car;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello world");
//		FilmStarRepresentation filmStar = new FilmStarRepresentation();
//		filmStar.setName("Akshay Kumar");
//		filmStar.setHeight(6);
//		filmStar.setWeight(80);
//		String[] movies = {"ABC","XYZ","ZZZ"};
//		filmStar.setMovies(movies);
		
//		System.out.println(filmStar);
		
		
//		HumanRepresentation human = new HumanRepresentation();
//		human.setName("Amir Khan");
//		human.setHeight(10);;
//		human.setWeight(20);
//		System.out.println(human);
		//human.setMovies();
		
//		FilmStarRepresentation filmStarAmirKhan = new FilmStarRepresentation();
//		filmStar.setName("Amir Khan");
//		filmStar.setHeight(30);
//		filmStar.setWeight(60);;
//		String[] moviesOfAmirKhan = {"3 idiots","PK"};
//		filmStar.setMovies(moviesOfAmirKhan);
//		
//		System.out.println(filmStar);

//		a extends b 
//		b extends c - multilevel, Allowed
		
//		a extends b,c - multiple, Not Allowed
		
		
		// runtime polymorphism - overriding
//		Bike bike = new Bike();
//		bike.runWithExtraParams();
//		bike.start();
//		
//		Car car = new Car();
//		car.runWithExtraParams();
//		car.start();
		
		
		// compiletime polymorphism - overloading
//		Calculator c = new Calculator();
//		c.sum(0, 0, 0);
		
		
		Car car = new Bike(); //upcasting
		car.runWithExtraParams();
		
	}
	
	
	
	// inheritance p,c
}
