package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		ArrayList <String> name = new ArrayList<>(Arrays.asList("Zuha", "Fatima", "Ayesha","Muhammad"));
		ArrayList <String> nameOne = new ArrayList<>();
		nameOne.add("Marry");
		
		//Declaring and initiating Linekd List
		//LinkedList <String> linkedNameOne = new LinkedList<>(Arrays.asList("Zuha", "Fatima", "Ayesha","Muhammad"));
		LinkedList <String> linkedName = new LinkedList<>();
		
		//Adding values to linked list
		linkedName.add("Trisha");
		linkedName.add("Roshni");
		linkedName.add("Meena");
		
		//Printing all the values of Linked list 
		System.out.println(linkedName);
		
		//Getting size of the linked list
		
		System.out.println(linkedName.size());
		
		//To print any specific element
		System.out.println(linkedName.get(0));
		
		System.out.println("\n");
		//to loop all the values of the LinkedList
		
		for (int i=0; i<linkedName.size(); i++) {
			System.out.println(linkedName.get(i));
		}
		
		//You can add any value to any specific index
		linkedName.add(0,"Bushra");
		System.out.println(linkedName);
		
		linkedName.add(3,"Deena");
		System.out.println(linkedName);
		
		
		//adding without Index will add the value at the end
		linkedName.add("Teena");
		System.out.println(linkedName);
		
		System.out.println("\n");
		
		//to change any value in the Linkedlist we use set() method
		
		linkedName.set(1, "Rupa");
		System.out.println(linkedName);
		
		System.out.println("\n");
		//Removing any value
		
		linkedName.remove(0);
		System.out.println(linkedName);
		
		linkedName.remove("Roshni");
		System.out.println(linkedName);
		
		System.out.println(linkedName.getFirst());
		System.out.println(linkedName.getLast());
		
		System.out.println(linkedName.peek());
		//Both ArrayList and LinkedList implements List Interface
		
		List <Integer> list1= new LinkedList<>();
		List <Integer> list2= new ArrayList<>();
		
		
	

	

	}

}
