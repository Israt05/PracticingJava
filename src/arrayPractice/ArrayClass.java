package arrayPractice;

public class ArrayClass {

public static void main(String[] args) {
	
		
String [] color = new String [4]; //0 1 2 3
		color[0]= "Red";
		color [1]= "Pink";
		color [2]="Black";
		color [3]="Blue";
		
	System.out.println(color[3]);
		
		
String [] colorOne= {"Red","Pink", "Black", "Blue"};
		
	System.out.println(colorOne[3]);
		
	System.out.println(color); // we can not print all the values of an array just like primitive variables
		
//for (int j = 0; j<=5; j++) {
	//System.out.println(j);
		//}
		
for (int i=0; i<color.length; i++) {
	System.out.println(color [i]);
		}
		
		//Arrays contain more than one values
String [] name = {"John", "Devid", "Michael", "George"}; //you can give the square bracket After the type
		System.out.println(name[2]); //you can print each of the values of the string based on their index where index starts from zero
		
String  name2 [] = {"John", "Devid", "Michael","George"}; //you can give the square bracket After the nam of the variable
		System.out.println(name[2]);
		
		//We can have the arrays of all primitive variable
		
        int numberOne []= {2,5,7,54,76};
		double numberTwo [] = {4.6, 7.3,6.9, 3.14};
		char characters [] = {'A', 'B', 'C', 'd', 'm'};
		boolean bool []= {true, false, false, true, true};
		
		
		for (int j = 0; j<=5; j++) {
			System.out.println("Alpha");		
		
		
		

	}
}
}
