package practice061822;

public class Laptop {
	
	static int laptopPrice;
	static int laptopTax;
	int notebookPrice = 1000;

	public static void laptopRam() {
	System.out.println("Ram is 16 GB");
	}
	
	public void monitorSize() {
		System.out.println("Monitor is 32 inch");
	}
	
	public static void laptoptotalPrice() {
	int totalPrice;
	 laptopPrice = 500;
	 laptopTax = 50;
	 totalPrice = laptopPrice + laptopTax;
		System.out.println("The total price is " + totalPrice);	
		}
	
	public void totalMemory () {
		int romMemory = 100;
		int ramMemory = 200;
		int pendriveMemory = 500;
		int harddriveMemory = 2000;
		int totalMemorySize = romMemory + ramMemory + pendriveMemory + harddriveMemory ;
		
		System.out.println("Total memory is " + totalMemorySize);
		}
	
	public void totalMousePrice () {
		int singleMousePrice = 20;
		int totalMousePrice = (10* singleMousePrice);
		
		System.out.println("Total Mouse Price is " + totalMousePrice);
	}
	
	public void totalCalculation () {
	int milkPrice = 3;
	double chiaseedPrice = 2.5;
	int spinachPrice = 4;
	double mangoPrice = 7.25;
	int totalPurchase1 = 3* (milkPrice + spinachPrice);
	double totalPurchase2 = 50 - (mangoPrice + chiaseedPrice );
	double totalCalculation = (totalPurchase1 + totalPurchase2 );
	System.out.println(totalPurchase1);
	System.out.println(totalPurchase2);
	System.out.println("Money left " +totalCalculation );
	}
	
}

