package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
			
			ArrayList <String> name = new ArrayList<>(Arrays.asList("Zuha", "Fatima", "Ayesha","Muhammad"));
			
			
			
			//to get how many values in the array list we call size() method
			System.out.println(name.size());
			
			// to get specific values of an array list we pass get() method
			System.out.println(name.get(3));
			
			//to iterate all the values of ArrayList
			System.out.println("\n");
			
			for (int i=0; i<name.size(); i++) {
				System.out.println(name.get(i));
			}
			//you can get the list of all the values of an arraylist when you print the variable
			System.out.println(name); //it will print 4 values
			
			System.out.println("\n");
			
			name.add("Neeti");
			name.add("Israt");
			name.add("Smrity");
			
			System.out.println(name); //it will print 7 values
			
			System.out.println(name.size());
			
			System.out.println("\n");
			
			for (int i=0; i<name.size(); i++) {
				System.out.println(name.get(i));
			}
			
			System.out.println("\n");
			
			//to change any value in the arraylist we use set() method
			name.set(5,"Topu");
			System.out.println(name);
			
			System.out.println(name.get(5));
			//we can remove a value from array list by using remove (index) or remove (value)
			
			System.out.println("\n");
			name.remove(0);
			name.remove("Ayesha");
			
			System.out.println(name);
			System.out.println(name.get(0));
			
			System.out.println("\n");
			
			for (int i=0; i<name.size(); i++) {
				System.out.println(name.get(i));
			}
			
			System.out.println(name);
			
			//ArrayList in Java has no fixed size, you can change the size, it can  grow or shrink
			
			//wrapper class of int = Integer
			//Wrapper class of char= Character
			//Wrapper class of double is Double
			//wrapper class of boolean is Boolean
			
			ArrayList <Integer> number = new ArrayList<>(Arrays.asList(5,6,98,45,87,4));
			ArrayList <Integer> numberOne = new ArrayList<>();
			
			ArrayList <Character> grade = new ArrayList<>(Arrays.asList('A','B', 'C', 'd'));
			ArrayList <Boolean> isHappy = new ArrayList<>(Arrays.asList(true, false, true, false, false));
			ArrayList <Double> temparature = new ArrayList<>(Arrays.asList(37.5, 45.6, 98.4));
			
			
					

		}

	}

	
