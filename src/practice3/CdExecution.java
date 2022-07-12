package practice3;



public class CdExecution {

	public static void main(String[] args) {
		
		ColdDrinks cd3 = new ColdDrinks();
		cd3.coldDrinkName = "Coke";
		cd3.bottleMl = 5;
		cd3.taste = 'A';
		cd3.refreshing = true;
		
		
		Perfume pr1 = new Perfume();
		
		pr1.Brand = "MJacob";
		pr1.Name = "Daisy";
		pr1.perfumeSize = 100;
		pr1.price = 150.25;
		pr1.smellGood =true;
		
		System.out.println("I bought a perfume from " + pr1.Brand + ", called " + pr1.Name + ". Its size is " + pr1.perfumeSize + " Ml and price is " + pr1.price +
			  ". It smells so good. ");
		
		
		
		
		
		
		
		System.out.println( "I love to drink "+ cd3.coldDrinkName + " which is " + cd3.bottleMl + " Ml " + "and that is graded " + cd3.taste +
				" in taste and refreshing. ");
		
		

	}

}
