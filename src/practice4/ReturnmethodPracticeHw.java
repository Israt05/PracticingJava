package practice4;

public class ReturnmethodPracticeHw {

	public static void main(String[] args) {
		System.out.println(decorationParts("Pink","Blue","White"));
		System.out.println(ticketType("A type","B type"));
		System.out.println(serialNumber(9,11));
		System.out.println(carNumber(3,9));
		System.out.println(studyCase(true,false));
		
		ReturnmethodPracticeHw rp = new ReturnmethodPracticeHw();
		
		System.out.println(decorationParts("Black","SkyBlue","Green"));
		System.out.println(ticketType("b type","c type"));
		System.out.println(serialNumber(11,9));
		System.out.println(carNumber(8,5));
		System.out.println(studyCase(true,false));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static String decorationParts (String Door, String Window, String Glass) {
		String house;
		house="One "+ Door +" door and two "+ Window + " windos ";
		System.out.println(house);
		
		String homeDecor = "The door is Pink, window is blue and Glass is white. ";
		return(homeDecor);
	}
	public static String ticketType(String firstClass, String secondClass) {
	String passengerType = firstClass + " passengers are posh and "+ secondClass + " passengers are middle class";
			
			return(passengerType);
	}
	public static int serialNumber(int roundOne, int roundTwo) {
		int serialCount;
		serialCount= 28*roundOne /roundTwo;
		
		return(serialCount);
		
	}
	public static int carNumber(int slot1, int slot2) {
		int carCount;
		carCount= 100/slot1 + 2*slot2;
		
		return(carCount);
	}
	public static boolean studyCase (boolean statement1, boolean statement2) {
		boolean inGeneral;
		
		inGeneral =   statement1  ;
		System.out.println("This case study is " + statement1+ " but the other one is "+statement2 );
		return(inGeneral);
	}
	

	public String decorationParts1 (String Door, String Window, String Glass) {
		String house;
		house="One "+ Door +" door and two "+ Window + " windos ";
		System.out.println(house);
		
		String homeDecor = "The door is Pink, window is blue and Glass is white. ";
		return(homeDecor);
	}
	public String ticketType1(String firstClass, String secondClass) {
	String passengerType = firstClass + " passengers are posh and "+ secondClass + " passengers are middle class";
			
			return(passengerType);
	}
	public int serialNumber1(int roundOne, int roundTwo) {
		int serialCount;
		serialCount= 28*roundOne /roundTwo;
		
		return(serialCount);
		
	}
	public int carNumber1(int slot1, int slot2) {
		int carCount;
		carCount= 100/slot1 + 2*slot2;
		
		return(carCount);
	}
	public boolean studyCase1 (boolean statement1, boolean statement2) {
		boolean inGeneral;
		
		inGeneral =   statement1  ;
		System.out.println("This case study is " + statement1+ " but the other one is "+statement2 );
		return(inGeneral);
	}
	
	
	
	
	
	
}
