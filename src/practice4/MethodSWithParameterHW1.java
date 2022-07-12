package practice4;

public class MethodSWithParameterHW1 {

	public static void main(String[] args) {
		
		hotelOrg("Radison", "West Town", "Monroe", "Louisiana");
		
		roomNumber(5,7,8,9);
		
		lightTotal(2.2,3.3,4.4,5.5);
		everythingTotal("Radison", 110, 450.6);
		
		MethodSWithParameterHW1 mp1 = new MethodSWithParameterHW1();
		
		mp1.hotelOrg12("Blue", "North Town", "West Monroe", "LA");
		mp1.roomNumber1(5,7,8,9);
		mp1.lightTotal1(2.2,3.3,4.4,5.5);
		mp1.everythingTotal1("Radison", 110, 450.6);
		
		
		
	}	
		
		
		public static void hotelOrg (String Name, String Location, String City, String State) {
			System.out.println("The hotel name is "+ Name + ". It is situated in "+ Location + ". The city is "+
					City + " under the state "+ State);
		}
		public static void roomNumber (int a, int b, int c, int d) {
			int totalRoom = (a+b+c)*20 ;
			System.out.println("The total room is "+ totalRoom);
		}
		public static void lightTotal(double w, double x, double y, double z) {
			double blueLight = (28*w + 10/x + y + 4*z);
			System.out.println("Total light in the hotel is "+ blueLight);
		}
		
		public static void everythingTotal(String Name,int room, double light) {
			
			System.out.println("The hotel "+ Name + " has "+room +" rooms and "+light + " lights." );
		}
		
		
		
		
		
		public void  hotelOrg12 (String Name, String Location, String City, String State) {
			System.out.println("The hotel name is "+ Name + ". It is situated in "+ Location + ". The city is "+
					City + " under the state "+ State);
		}
		public void roomNumber1 (int a, int b, int c, int d) {
			int totalRoom = (a+b+c)*20 ;
			System.out.println("The total room is "+ totalRoom);
		}
		public void lightTotal1(double w, double x, double y, double z) {
			double blueLight = (28*w + 10/x + y + 4*z);
			System.out.println("Total light in the hotel is "+ blueLight);
		}
		
		public void everythingTotal1(String Name,int room, double light) {
			
			System.out.println("The hotel "+ Name + " has "+room +" rooms and "+light + " lights." );
		}
		
}
