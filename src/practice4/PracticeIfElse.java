package practice4;

public class PracticeIfElse {

	public static void main(String[] args) {
		
		PracticeIfElse2 pf =new PracticeIfElse2();
		
		pf.toss("Tail","Head");
		
		
		if (pf.dressColor=="Red" && pf.money>=10) {
			System.out.println("Enter to the building");
			
		}
		else if (pf.dressColor!="Red" && pf.money>=10) {
			System.out.println("You have money but need to wear red");
		}
		else if (pf.dressColor=="Red" && pf.money<10) {
			System.out.println("You wear red but dont have money");
		}
		else if (pf.dressColor!="Red" || pf.money<10) {
			System.out.println("You dont have money and red dress");
		}
		else {
			System.out.println("Thank You!");
		}
			
		
		
		
	}
//RT, R1T, RT1, R1T1,
//ht,hh,tt,th	
	

		
	}

