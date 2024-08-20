package abstraction.interf.impl;

import abstraction.interf.Person;

public class PersonImplementationClass implements Person{

	@Override
	public void show() {
		System.out.println("Person Representative");
	}

	@Override
	public void name() {
		System.out.println("Testing Name Method");
	}

	@Override
	public void age() {
		System.out.println("Testing Age Method");
	}

}
