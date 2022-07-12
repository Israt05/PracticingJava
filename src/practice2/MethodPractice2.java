package practice2;

public class MethodPractice2 {

	public static void main(String[] args) {
	
		System.out.println("A patient came at hospital named " + patientName + ", doctor gave her " + medicineDose + " doses of medicine " +
		" and she was marked patient type " + patientType + " having severe condition. ");

		MethodPractice2 mc1 = new MethodPractice2();
		
		System.out.println( mc1.clientName + " is a "+ mc1.clientType + " type client and he submitted " + mc1.projectNumber + " projects. ");
		
		work1();
		work2();
		work3();
		work4();
		work5();
		mc1.type1();
		mc1.type2();
		mc1.type3();
		mc1.type4();
		mc1.type5();
		
	}
	static String patientName = "Rose";
	String clientName = "Alex";
	static int medicineDose = 9;
	int projectNumber = 12;
	static char patientType = 'P';
	char clientType = 'C';
	static boolean conditionSevere = true;
	boolean clientImportance = true;

	public static void work1 () {
		System.out.println("Severe patients are priority");
	}
	public static void work2 () {
	System.out.println("Doctors were available");	
	}
	public static void work3 () {
		System.out.println("Doctors give medicine");
    }
	public static void work4 () {
		System.out.println("Medicine should be taken timely");
	}
	public static void work5 () {
		System.out.println("Patients are treated nicely");
	}
	public void type1 () {
		System.out.println("Clients are important");
	}
	public void type2 () {
		System.out.println("Company works for them");
	}
	public void type3 () {
		System.out.println("Clients are demanding");
	}
	public void type4 () {
		System.out.println("Clients have objections");
    }
	public void type5 () {
		System.out.println("Delivery should be in time");
	}
}
