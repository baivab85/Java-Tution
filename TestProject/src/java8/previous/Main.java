package java8.previous;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(1);
		list.add(15);
		list.add(4);
		
		// find the largest number from array list
		int maxEl = list.get(0);
		for(int i: list) {
			if(maxEl < i) maxEl = i;
		}
		
		System.out.println("Largest Number :"+maxEl);
		
		
		// find the squares of numbers of array list and store it to another array list.
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			int temp = list.get(i)*list.get(i);
//			temp = (temp%2)!=0? temp+1: temp;
			result.add(temp);
		}
		
		System.out.println(result);
		
	}
}
