package constructorPractice;

public class Television {
   String brandName;
	int tvsize;
	boolean smartType;
	
	Television (String brandName){
		this.brandName = brandName;
	}
	
	Television(){
		
	}
	
	Television(String brandName,int tvsize){
		this.brandName = brandName;
		this.tvsize= tvsize;
	}
	Television (String brandName,int tvsize,boolean smartType){
		this.brandName = brandName;
		this.tvsize= tvsize;
		this.smartType = smartType;
	}
	Television (int tvsize,boolean smartType){
		this.tvsize= tvsize;
		this.smartType = smartType;
	}
	
	
	
}
