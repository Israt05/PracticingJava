package basicPractice;

public class LearningMethods {

	public static void main(String[] args) {
		//methodOne();
		//LearningMethods.methodOne();
		//methodThree();
		//methodFive();
		//methodSeven();
		System.out.println(age);
		//System.out.println(weight);
		
		
		LearningMethods lm= new LearningMethods();
		lm.methodTwo();
		lm.methodFour();
		lm.methodSix();
		lm.methodEight();
		System.out.println(lm.weight);		
	}

	static int age=10;
	int weight=60;
	
	public static void methodOne() {
		System.out.println("I am public static method one, out side main method");
	}
	
	public void methodTwo() {
		System.out.println("I am public Non-static method two, out side main method");
	}
	
	private static void methodThree() {
		System.out.println("I am private static method three, out side main method");
	}
	
	private void methodFour() {
		System.out.println("I am Private Non-static method four, out side main method");
	}
	
	protected static void methodFive() {
		System.out.println("I am Protected static method FIve, out side main method");
	}
	
	protected void methodSix() {
		System.out.println("I am Protected Non-static method six, out side main method");
	}
	
	static void methodSeven () {
		System.out.println("I am Default static method seven, out side main method");
	}
	
	void methodEight () {
		System.out.println("I am Default Non-static method eight, out side main method");
	}
	
	
	
}
