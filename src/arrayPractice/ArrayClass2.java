package arrayPractice;

public class ArrayClass2 {

public static void main(String[] args) {
	
   String [] color = new String [4]; 
 
	 color[0]= "White";
	 color[1]= "Red";
	 color[2]="Purple";
	 color[3]="Black";
	 
	 System.out.println(color[2]);
	 color [2]= "Yellow";
	 System.out.println(color[2]);
	 
   String [] colorOne= {"White","Red", "Purple", "Black"};
		
	 System.out.println(colorOne[3]);
		
	for (int i=0; i<colorOne.length; i++) {
	 System.out.println(colorOne[i]);
		}
		
	 int [] number = new int [5];	
	 
	 number [0]= 10;
	 number [1]= 20;
	 number [2]= 30;
	 number [3]= 40;
	 number [4]= 50;
	 
	 System.out.println(number [0]);
	 
	 int [] number1 = {10,20,30,40,50};
	 
	 System.out.println(number1[4]);
	 
	 for (int j=0;j<number1.length;j++) {
		System.out.println(number1[j]); 
	 }
	  
	 double [] marks = new double [4];	
	 
	 marks [0]= 30.3;
	 marks [1]= 40.3;
	 marks [2]= 50.3;	
	 marks [3]= 60.3;
	 
	 System.out.println(marks [0]);
	 
	 double [] marks1 = {30.3,40.3,50.3,60.3};
	 System.out.println(marks1[2]);
	 for (int i=0; i<marks1.length; i++) {
		System.out.println(marks1[i]); 
	 }
     char [] characters = new char [4];	
     
	System.out.println(characters.length); 
	
     characters [0]= 'A';
     characters [1]= 'B';
     characters [2]= 'C';	
     characters [3]= 'D';
	 
	 System.out.println(characters[1]);
	 
	 char [] characters1 = {'A','B','C','D'};
	 System.out.println(characters[2]);
	 for (int i=0; i<characters.length; i++) {
		System.out.println(characters[i]); 
	 }
	  boolean [] bools = new boolean [4];	
		 
	     bools [0]= true;
	     bools [1]= false;
	     bools [2]= true;	
	     bools [3]= false;
		 
		 System.out.println(bools[1]);
		 
		 boolean [] bools1 = {true,false,true,false};
		 System.out.println(bools[2]);
		 for (int i=0; i<bools1.length; i++) {
			System.out.println(bools1[i]); 
		 }
	 
	 
	 
	 
	 
	
}
}
