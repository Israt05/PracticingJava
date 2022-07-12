package practice061822;

public class MethodHW1 {

	String cakeBrand = "Coopers";
	int cakeNumber = 50;
	double cakePrice= 300.50;
	int guestNumber = 1000;
	
		public void birthdaySet() {
		int guestCame = 20*guestNumber;
		double totalCake = (1000/50 + cakePrice);
		double netBill = (totalCake +totalCake);
		double costDue = (netBill/2 - 10);
		
		System.out.println("The group bought the birthday cake from " + cakeBrand + ". The total guest were "+ guestCame +". They spend "
				+ "money for the program is " + totalCake + ". The net bill is " + netBill);
		System.out.println("Cost due is " +costDue);
		
	}
	
	public void gymPlan () {
		
	int gymMember = 300;
	char gymService = 'A';
	int gymServiceCost = 75;
	int saunaCost = 50;
	double swmmingCost = 45.5;
	
	double totalServiceCost = (gymServiceCost +saunaCost +swmmingCost);
	
	double perPersonCost = 300/totalServiceCost;
	double onlyGymCost = (totalServiceCost -perPersonCost);
			
	System.out.println("Per person cost is " + 100/perPersonCost );	
	System.out.println(" Only gym cost is "+ onlyGymCost);
	System.out.println("The gym cost per person is " + 50*perPersonCost + ". The servicee is graded "+ gymService);
	System.out.println("Only gym cost is "+ onlyGymCost);
	System.out.println("Total gym member is " + 2*gymMember);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
