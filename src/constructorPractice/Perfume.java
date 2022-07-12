package constructorPractice;

public class Perfume {
	
	String perfumeName ;
	int price ;
	char quality;
	
	Perfume (String perfumeName){
		this.perfumeName= perfumeName;
	}
	
	public void perfumeType () {
		System.out.println("I love the perfume");
	}
	
	Perfume (){
		
	}
	
	Perfume (String pfName,int pfPrice){
		this.perfumeName = pfName;
		this.price = pfPrice;
	}
	
	Perfume (String perfumeName , int price, char quality ){
		this.perfumeName = perfumeName;
		this.price =price;
		this.quality = quality;
	}
		
		
		
		
		
		
		
	
	
	
	
	
}
