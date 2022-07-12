package basicPractice;

public class MethodWithParameter {

	public static void main(String[] args) {
		niceColor("Green");
		niceColor("Pink");
		niceColor("Black");
		
		studentAge(12);
		studentCgpa(3.45);
		identityHuman("Prity", 28, "Asian", 5.4);
		identityHuman("Topu", 90, "Mexican", 5.2);
		identityHuman("Bob", 25, "Canadian", 5.11);
		addValue(25,32);
		addValue(15,12);
		multiplyValue(3,4,5);
		studentCgpaCal("Nity", 4, 3.9, 3.8);
		studentCgpaCal("Bushra", 2.75, 3.1, 3.0);
		studentCgpaCal("Prity", 4.0, 4.0, 4.0);
		
	}
	
	
	
	public static void niceColor(String color) {
		System.out.println(color);
	}
	
	
	public static void studentAge (int age) {
		System.out.println(age);
	}
	
	public static void studentCgpa (double cgpa) {
		System.out.println(cgpa);
	}
	
	public static void identityHuman (String name, int age, String race, double hight) {
		System.out.println(name + ", " +age+", "  + race +", " + hight);
	}

	
	public static void addValue (int a, int b) {
		System.out.println(a+b);
	}
	
	public static void multiplyValue (int x, int y, int z) {
		System.out.println(x*y*z);
	}
	
	public static void studentCgpaCal (String stdntName, double financeCgpa, double mathCgpa, double accountCgpa) {
		//double finalCgpa = (financeCgpa+mathCgpa+accountCgpa)/3;
		System.out.println("my name is "+ stdntName+ ", my cgpa is: " +(financeCgpa+mathCgpa+accountCgpa)/3);
		System.out.println("my father named me as : "+ stdntName);
		System.out.println("agerage cgpa of math and accounting is: " + (mathCgpa+accountCgpa)/2);
	}
	
	
}
