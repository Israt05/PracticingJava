package basicPractice;

public class ExecutionClass {

	public static void main(String[] args) {
		
		String myName="Prity";
		
		//System.out.println(myName);
		//Name of the class, give object name, equal sign, key word new, then again class name with parenthesis, semicolon
		
		CreditCard ccPrity = new CreditCard();
		ccPrity.creditCardName="Amex";
		ccPrity.creditCardColor= "Blue";
		ccPrity.creditLimit=500.50;
		ccPrity.expiryYear=2026;
		ccPrity.isWalletIncluded=true;
		ccPrity.printSomething();
		
		
		
		
		
		
		
		CreditCard ccNeety = new CreditCard();
		ccNeety.creditCardName ="MasterCard";
		ccNeety.creditCardColor="Green";
		ccNeety.creditLimit=1000.75;
		ccNeety.expiryYear=2025;
		ccNeety.isWalletIncluded=false;
		
		CreditCard ccPrity2 = new CreditCard();
		ccPrity2.creditCardName ="Visa";
		ccPrity2.creditCardColor="Red";
		ccPrity2.creditLimit=1500.75;
		ccPrity2.expiryYear=2027;
		ccPrity2.isWalletIncluded=true;
		
		//System.out.println("My First card is " +ccNeety.creditCardName);
		//System.out.println("My card will expire in "+ ccNeety.expiryYear);
		
		//Name of the class, give object name, equal sign, key word new, then again class name with parenthesis, semicolon
		
		
		CellPhone cpRupok1 = new CellPhone();
		
		cpRupok1.nameOfPhone="iPhone";
		cpRupok1.price=1200;
		cpRupok1.weight=300.75;
		cpRupok1.isSmart=true;
		//System.out.println("My phone is "+cpRupok1.nameOfPhone+", thats price is "+ cpRupok1.price );
		
	}

}
