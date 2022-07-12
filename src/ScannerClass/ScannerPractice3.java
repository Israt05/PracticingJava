package ScannerClass;

import java.util.Scanner;

public class ScannerPractice3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("You can get Mangoes");
		
		String type1 = sc.next();
	    System.out.println("type1");
	    
	    
	    String type2 = sc.next();
	    System.out.println("type2");
	   
	    
	    char grade = sc.next().charAt(0);
	    System.out.println(grade);
	    System.out.println("Please enter mango taste");
	    
	    double p = sc.nextDouble();
	    System.out.println(p);
	    System.out.println("Please enter mango weight");
	    
	    
	    
	    if (type1=="A" || type2!="A") {
	    	System.out.println("You get the best mangoes");
	    }
	    else if (type1 !="A" || type2!="A" ){
	    	System.out.println("You get the sour mangoes");
	    }
	    	
	    
	    
	    
	    
	    
	    
	}

}
