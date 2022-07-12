package practice4;

public class IfElseStatement {

	public static void main(String[] args) {
	
		//idCard("CreditCard");
		//marksGrade(25, "FirstBoy");
		//moodFatima("Crying");
		modulasNumber(100);
	}

	
	 public static void idCard (String cardType ) {
		 
		 if (cardType == "DrivingLicence") {
			System.out.println("Go to DMV office ");	
			}
		 else if (cardType == "OfficeIDCard") {
			System.out.println("Go to IBM office ");	 
		 }
		 else if  (cardType == "DebitCard") {
			System.out.println("Go to IBM office ");	 
		 }
		 else if (cardType == "CreditCard") {
			System.out.println("Go to Walmart ");	 
		 }
		 else {
			 System.out.println("Stay home");	
		 }
		 
     } //Boundary testing
	  
	 public static void marksGrade (double marks, String studentType) {
		 if ((marks > 95 && marks <= 100) || (studentType == "FirstBoy")) {
			 System.out.println("Student got A+");
			 
		 }
		 else if (marks > 90 && marks<= 95) {
			 System.out.println("Student got A");
		 }
		 else if (marks > 85 && marks<= 90) {
			 System.out.println("Student got B+");
		 }
		 else if (marks > 80 && marks<= 85) {
			 System.out.println("Student got B-");
		 }
		 else if (marks > 75 && marks<= 80) {
			 System.out.println("Student got C");
		 }
		 else if (marks > 70 && marks<= 75) {
			 System.out.println("Student got D");
		 }
		 
		 else if (marks <= 70 && marks>= 0) {
			 System.out.println("Student got F");
		 }
		 else if (marks < 0) {
			 System.out.println("Marks can not be negative");
		 }
		 else if (marks > 100) {
			 System.out.println("Marks can not be more than 100");
		 }
		 else {
			 System.out.println("You did not give proper input");	
		 }

    }
	 
	 public static void moodFatima (String MoodType) {
		 if (MoodType == "Crying") {
			 System.out.println("Fatime is bored");
		 }
		 else if (MoodType == "Laughing") {
			 System.out.println("Fatime is happy");
		 }
		 
		 else if (MoodType == "Cranky") {
			 System.out.println("Fatime is hungry");
		 }
		 else if (MoodType == "Yellow Dudu") {
			 System.out.println("Fatime wants milk");
		 }
		 else {
			 System.out.println("Fatima wants to sleep");
			
		 }
		 
	 }
	 public static void modulasNumber (int number) {
		 if (number%3 ==0) {
			 System.out.println("Fanta");
		 }
		 else if (number%5 ==0) {
			 System.out.println("Sprite");
		 }
		 else if (number%3 ==0 && number%5==0)  {
			 System.out.println("Coke");
		 }
		else {
			 System.out.println("Muri Khan");
			 
		 }
		 
		 
	 }
	 
	 
	 
		 
	 }
	 
	 

