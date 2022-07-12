package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		 
		ArrayList <String> name = new ArrayList <>(Arrays.asList("Sam","Tom","Michael","Alex"));
		
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		for (int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println(name);
		
		name.add("Harry");
		name.add("Peter");
		
		System.out.println(name);
		System.out.println(name.size());
		
		for(int i=0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		 name.set(0,"Jack");
		 name.set(2,"Jill");
		
		System.out.println(name);
		System.out.println(name.get(3));
		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println(name);
		 name.remove(2);
		 name.remove("Jack");
		System.out.println(name);
		System.out.println(name.get(0));
		System.out.println("\n");
		
		
		ArrayList <Integer> number= new ArrayList<>(Arrays.asList(20,30,40,50,60,70));
		
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
		
		
		
		ArrayList <Character> grade = new ArrayList <>(Arrays.asList('A','B','C','D','E'));
		
		System.out.println(grade.size());
		System.out.println(grade.get(2));
		for(int i=0;i<grade.size();i++) {
		System.out.println(grade.get(i));	
		}
		System.out.println(grade);
		
		grade.add('E');
		System.out.println(grade);
		System.out.println(grade.size());
		for(int i=0; i<grade.size();i++) {
		System.out.println(grade.get(i));	
		}
		System.out.println(grade);
		System.out.println("\n");
		grade.set(1,'F');
		System.out.println(grade);
		System.out.println(grade.get(3));
		
		grade.remove(1);
		System.out.println(grade);
		System.out.println(grade.get(4));
		

ArrayList <Boolean> isSad = new ArrayList <>(Arrays.asList(true,false,true,false,false,true));
		
		System.out.println(isSad.size());
		System.out.println(isSad.get(2));
		for(int i=0;i<isSad.size();i++) {
		System.out.println(isSad.get(i));	
		}
		System.out.println(isSad);
		isSad.add(false);
		System.out.println(isSad);
		System.out.println(isSad.size());
		for(int i=0; i<isSad.size();i++) {
		System.out.println(isSad.get(i));	
		}
		System.out.println(isSad);
		System.out.println("\n");
		isSad.set(2, false);
		System.out.println(isSad);
		System.out.println(isSad.get(2));
		
		isSad.remove(1);
		System.out.println(isSad);
		System.out.println(isSad.get(4));
		
		
		ArrayList <Double> series = new ArrayList <>(Arrays.asList(2.2,3.3,4.3,50.1,65.5,75.5,85.5));
		System.out.println(series.size());
		System.out.println(series.get(2));
		for(int i=0;i<series.size();i++) {
		System.out.println(series.get(2));	
		}
		series.add(2.7);
		series.add(3.8);
		System.out.println(series);
		System.out.println(series.get(4));
		for(int i=0;i<series.size();i++){
		System.out.println(series.get(i));
		}
		series.set(4, 5.6);
		System.out.println(series);
		System.out.println(series.get(3));
		series.remove(2);
		
		System.out.println(series);
		System.out.println(series.get(1));
		
		
		
		
		
	}

}

