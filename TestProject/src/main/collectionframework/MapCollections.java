package main.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;

public class MapCollections {
	
	static List<Integer>  removeDuplicates(List<Integer>list) {
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(list);
		
		List<Integer> response = new ArrayList<Integer>();
		for(Integer i: s) response.add(i);
		return response;
		
	}
	public static void main(String[] args) {
		
		List<Integer> list= List.of(15,13,13,16);
//		System.out.println(list);
		
//		Set<Integer> s = new HashSet<Integer>();
//		Set<Integer> s = new LinkedHashSet<Integer>();
 
//		s.addAll(list);
//		List<Integer> result = removeDuplicates(list);
		
		
		
//		for(int i=0; i<1000;i++) s.add(i);
		
//		System.out.println(result);
		
//		{
//			roll: 1, name: subhradeep,
//			roll: 2, name: debarghya,
//			roll: 3, name: devasmita
//		}
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1, "subhradeep");
		students.put(22, "debarghya");
		students.put(3, "devasmita");
		
		
//		for(Entry<Integer, String> ent: students.entrySet()) {
//			System.out.println("Roll :"+ent.getKey()+", Name :"+ent.getValue());
//		}
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Subhradeep", 10);
		marks.put("Baivab", 11);
		marks.put("Tarunima",12);
		
//		System.out.println(marks.get("Baivab"));
		
//		marks.forEach((key, value)->System.out.println(key+" "+value));
		
		
		
		
		
		
//		System.out.println(students.get(22));
	}
}
