package practice2;

public class MethodPractice1 {

	public static void main(String[] args) {
System.out.println(mobilePrice + ", is expensive for me. ");
System.out.println( " I like " + iphoneColor + " color iphone " );

MethodPractice1 mp1 = new MethodPractice1();

System.out.println( " I want " + mp1.numberPen + " pen");
System.out.println( " I want " + mp1.dressColor + " dress");

methodOne();
mp1.methodTwo();
}
	
static int mobilePrice = 500;
int numberPen = 30;
static String iphoneColor = "Black";
String dressColor = "Pink";

public static void methodOne() {
	System.out.println("This is my static method");
}

public void methodTwo() {
	System.out.println("This is my non static method");
}
	
	
}
