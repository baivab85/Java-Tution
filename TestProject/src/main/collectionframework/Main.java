package main.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import abstraction.interf.Person;
import abstraction.interf.impl.PersonImplementationClass;
import revesion.data.HumanRepresentation;

public class Main {
	public static void main(String[] args) {
//		collection
//		set - > duplicity remove
//		tree - > easy searching
//		graph - > long relationship handle, search efficient

//		resizable array
//		Person p = new PersonImplementationClass();
		
		
		

		List<Integer> list = new ArrayList<>();

//		array list -> single entity which can contain multiple objects

		list.add(12);
		list.add(13);
		list.add(6);
		list.add(6);

//		System.out.println(list.contains(6));
		
		
		Integer a = 12;
		Integer b = 12;
//		System.out.println(a==b);
		
//		String s1 = new String("Subhradeep");
//		String s2 = new String("Subhradeep");
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		System.out.println(s1.equals(s2));


		ArrayList<HumanRepresentation> humans = new ArrayList<HumanRepresentation>();
		humans.add(new HumanRepresentation("Akshay Kumar", 6, 60));
		humans.add(new HumanRepresentation("Salman Khan", 5, 70));
		humans.add(new HumanRepresentation("Arijit Singh", 6, 70));

		
//		System.out.println(humans.contains(new HumanRepresentation("Arijit Singh", 6, 70)));
		
		
		humans.indexOf(new HumanRepresentation("Salman Khan", 5, 70));
//		System.out.println(humans.indexOf(new HumanRepresentation("Arijit Singh", 6, 70)));
		//System.out.println(new HumanRepresentation("Akshay Kumar", 6, 60).equals(new HumanRepresentation("Akshay Kumar", 6, 60)));
//		System.out.println(humans.get(2));

//		for(HumanRepresentation h : humans) {
//			System.out.println(h);
//		}

//		for (int i = 0; i < humans.size(); i++) {
//			System.out.println(humans.get(i));
//		}

//		humans.forEach(e->System.out.println(e));

//		

//		humans.remove(1);

//		for (HumanRepresentation h : humans) {
//			System.out.println(h);
//		}
		

		
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(2);
		linkedList.add(13);
		
//		System.out.println(linkedList);
		
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.add(12);
//		stack.add(13);
//		stack.add(14);
//		
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		Map, Set, ArrayList, LinkedList
//		Queue<Integer> queue = 
		
		
		
		
//		Map, Set
//		Exception
		
		


	}
}
