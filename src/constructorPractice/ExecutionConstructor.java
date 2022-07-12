package constructorPractice;

public class ExecutionConstructor {

	public static void main (String[]args) {
		
	  Perfume pc = new Perfume (); //Here Perfume() is the default constructor of Perfume class
		pc.perfumeName = "Channel";
		pc.price =150;
		pc.quality= 'A';
		
		
	  System.out.println("Price of the perfume is:"+ pc.price);	
		
		
	  Perfume dc = new Perfume ();
		dc.perfumeName = "Dior";
		dc.price =120;
		dc.quality= 'A';
		
	  System.out.println("Quality of the perfume is:"+dc.quality );	
	  
		
	  Perfume gc = new Perfume ();
		gc.perfumeName = "Gucci";
		gc.price =180;
		gc.quality= 'B';
		
	  System.out.println("Name of the perfume is:"+gc.perfumeName);	
	  
	  Perfume ar = new Perfume ("Armani",178);
	  //ar.price= 175;
	  System.out.println(ar.price);
	  
	  Perfume dolce = new Perfume ("DolceGabbana", 250);
	  
	  
	  Perfume boss = new Perfume ("HugoBoss", 95, 'A');
	  System.out.println(boss.perfumeName+" " + boss.price+" " + boss.quality);
		
		Television tv = new Television();
		tv.brandName ="Sony";
		tv.tvsize =48;
		tv.smartType = true;
		System.out.println("Name of the brand is:"+tv.brandName);
		
		Television tv5 = new Television ("National");
		System.out.println("Our first TV was : "+ tv5.brandName);
		 
		Television tv2 = new Television("Samsung",52);
		tv2.smartType = true;
		System.out.println("Name of the brand is:"+ tv2.brandName +" and tv size is "+tv2.tvsize + "and smart type is "
				+ tv2.smartType);
	  
		Television tv3 = new Television("Walton",60,true);
		
		System.out.println("Name of the brand is:"+ tv3.brandName +" and tv size is "+tv3.tvsize + ". This is smart tv. "
				+ tv3.smartType);
	  
		Television tv4 = new Television(65,true);
		System.out.println("Name of the brand is:"+ tv4.brandName +" and tv size is "+tv4.tvsize + ". This is smart tv. "
				+ tv4.smartType);
	  
	}
}
