package java8.now;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(1);
		list.add(15);
		list.add(4);
		
		// find the largest number from array list
		int maxEl = list.stream().reduce(list.get(0), (t, u) -> t>u?t:u ).intValue();

		System.out.println("Largest Number :"+maxEl);
		
		// find the squares of numbers of array list and store it to another array list.
		List<Integer> result = list.stream().map(a->a*a).toList();
		

		
		System.out.println(result);
	}
}
