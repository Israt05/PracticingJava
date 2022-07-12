package practice4;

public class PracticeIfElse2 {
	
	int money =7;
	String dressColor= "White";
	
	
	public void toss(String Result1, String Result2) {
		if (Result1== "Head" && Result2=="Tail") {
			System.out.println("You do not win or lose");
		}
		else if (Result1== "Head" && Result2=="Head") {
			System.out.println("You win");
		}
		else if (Result1== "Tail" && Result2=="Tail") {
			System.out.println("You lose");
		}
		else if (Result1== "Tail" && Result2=="Head") {
			System.out.println("You do not win or lose");
		}
		else {
			System.out.println("Please enter head or tail only");
		}
	}
		
}



