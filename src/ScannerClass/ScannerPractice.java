package ScannerClass;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);   // Constructor	
		
		System.out.println(" Enter your Marks : ");			
		int n;
		n=sc.nextInt();
		System.out.println(n);
		
		
		if (n>=95 && n<=100) {
			System.out.println("your grade is A");
		}
		else if (n>=90 && n<95) {
			System.out.println("your grade is B");
		}
		else if (n>100 || n<0) {
			System.out.println("Please provide valid number");
		}
		else if (n>=80 && n<90) {
			System.out.println("your grade is C");
		}
		else if (n<80) {
			System.out.println("your grade is F");
			
		}else {
			System.out.println("You are welcome");
		}	


	}

}
