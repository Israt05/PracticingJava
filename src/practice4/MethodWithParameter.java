package practice4;

public class MethodWithParameter {

	public static void main(String[] args) {
		drinksName( "Prity", "Coke");
		drinksName( "Nity", "Fanta");
		
		avgSum(2,3,4);
		avgSum(100,200,300);
		avgSum(40,20,4);
	}

	public static void drinksName(String name,String d ) {
		System.out.println("My name is " + name + ", My favorite drink is "+ d);
	}
	
	public static void avgSum(int x, int y, int z) {
		double average = (x+y+z)/3;
		
		System.out.println("The average value is "+ average);
	}
	
}
