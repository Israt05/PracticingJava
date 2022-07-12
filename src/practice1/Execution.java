package practice1;

public class Execution {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.firstName = "Nity";
		s1.lastName = "Jahan";
		s1.studentRoll = 45;
		s1.grade = 'A';
		s1.cgpa = 3.30;
		s1.isFemale = true;
		
		Student s2 = new Student();
		s2.firstName = "Nusrat";
		s2.lastName = "Smrity";
		s2.studentRoll = 12;
		s2.grade = 'B';
		s2.cgpa = 3.45;
		s2.isFemale = true;
		
		MyActivities ac2 = new MyActivities();
		
		ac2.activityName = "Walking";
		ac2.walkingSteps = 2000;
		ac2.walkingDistance = 2.3;
		
	System.out.println();
		
		//System.out.println("I love "+ ac2.activityName +", my walking step is "+ ac2.walkingSteps+ ","+ "I walked "+ac2.walkingDistance+ " miles" );
		
		
		
		
		
		//System.out.println("My name is "+ s1.firstName+ " "+s1.lastName+ ","+ "my roll is " +s1.studentRoll+ ","+
		//"my grade is "+s1.grade+ " and cgpa is " +s1.cgpa);
		
		System.out.println("My name is "+ s2.firstName+ " "+s2.lastName+ ","+ "my roll is " +s2.studentRoll+ ","+
				"my grade is "+s2.grade+ " and cgpa is " +s2.cgpa);		

	}

}

