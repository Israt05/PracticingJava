package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

	public static void main(String[] args) {

	ArrayList <Integer> number2= new ArrayList<>(Arrays.asList(20,30,40,50,60,70));
	ArrayList <Integer> number= new ArrayList<>();
		System.out.println(number.size());
		System.out.println(number.get(2));
		
		for (int i=0;i<number.size();i++) {
			System.out.println(number.get(i));
		}
		System.out.println(number);
		number.add(101);
		number.add(201);
		
		System.out.println(number);
		System.out.println(number.size());
		
		for(int i=0; i<number.size();i++) {
			System.out.println(number.get(i));
		}
		number.set(0,19);
		number.set(2,21);
		
		System.out.println(number);
		System.out.println(number.get(3));
		
		for(int i=0;i<number.size();i++) {
			System.out.println(number.get(i));
		}
		System.out.println(number);
		number.remove(1);
		
		System.out.println(number);
		System.out.println(number.get(2));
		System.out.println("\n");
		
	
	}

}
