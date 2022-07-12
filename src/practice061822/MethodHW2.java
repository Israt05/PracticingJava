package practice061822;

public class MethodHW2 {
static int bookPrice;
static int penPrice;
static int pencilPrice;

	public static void totalPriceCost (){
	
	bookPrice = 20;
	penPrice = 5;
	 pencilPrice = 2;
	
	int actualPrice = (2*bookPrice + 10/penPrice);
	int totalMoneyLeft = (actualPrice - pencilPrice);
	
	System.out.println("The actual price is " + actualPrice);
	System.out.println("I spend to buy a book an pen in total "+ actualPrice);
	System.out.println("Total money left " + totalMoneyLeft);
	
}

public static void actualFoodCostTotal () {
	
	String cakeName = "Rainbow Cake";
	int fruitCakeCount = 6;
	double colorPrice = 5.67;
	int chocolateCakePrice = 30;
	int cakeCost = (36/fruitCakeCount + 3*chocolateCakePrice - 10);
	double actualFoodCost  = (cakeCost + colorPrice);
	

	System.out.println("Total Cake cost is " +cakeCost );
	System.out.println("Alex bought a "+ cakeName + ", it costs "+ actualFoodCost);
	
	
	
}


}
