package ScannerClass;

import java.util.*;

public class ScannerPractice2 {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		//suppress warning is used to remove the sc object error
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter Zuhair's mark");
		int z = sc.nextInt();
		System.out.println(z);
		System.out.println("\n");
		System.out.println("Please enter Fatima's mark");
		int f = sc.nextInt();
		System.out.println(f);
		
		if (z>f && z<=100 && z>=0 && f<=100 && f>=0) {
			System.out.println("Zuhair got higher marks");
		}
		else if (f>z && z<=100 && z>=0 && f<=100 && f>=0) {
			System.out.println("Fatima got higher marks");	
		}
		else if (f==z && z<=100 && z>=0 && f<=100 && f>=0) {
			System.out.println("Their marks are equal");	
			}
		else {
			System.out.println("Please provide valid number");
		}
		
		//notes
		/**Scanner sc = new Scanner (System.in);
		System.out.println("Please enter Zuhair's mark");
		int z = sc.nextInt();
		System.out.println(z);
		
		//Method	Description
	//nextInt()	reads an int value from the user
	//nextFloat()	reads a float value form the user
	//nextBoolean()	reads a boolean value from the user
	//nextLine()	reads a line of text from the user
	//next()	reads a word from the user
	//nextByte()	reads a byte value fr
		**/
		
	}

}
