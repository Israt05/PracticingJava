package arrayPractice;

import java.util.LinkedList;

public class LinkedListPractice2 {

	public static void main(String[] args) {
		LinkedList <String> linkedName = new LinkedList<>();
		linkedName.add("Pink");
		linkedName.add("Red");
		linkedName.add("Blue");
		
		System.out.println(linkedName);
		System.out.println(linkedName.size());
		System.out.println(linkedName.get(1));
		for(int i=0; i<linkedName.size(); i++) {
		System.out.println(linkedName.get(i));	
		}
		linkedName.add(0,"Orange");
		System.out.println(linkedName);
		
		linkedName.add(3,"Yellow");
		System.out.println(linkedName);
		
		linkedName.set(0, "Lemon");
		System.out.println(linkedName);
		linkedName.set(1, "Purple");
		System.out.println(linkedName);
		
		linkedName.remove(2);
		System.out.println(linkedName);
		
		
		
			
		
		
		
		
		
		
		
		
	}

}
