package basicPractice;

public class ReturnTypeMethod {

	public static void main(String[] args) {	
		
		ReturnTypeMethod rm=new ReturnTypeMethod();		
		
		System.out.println(rm.methodOne(10,8,7));

	}
	
	
	public int methodOne (int length, int width, int hight) {
		int area;		
		area= length*width;		
		int volume;
		volume= length* width*hight;
		//System.out.println("The area is: " +area);
		//System.out.println("The volume is: " +volume);		
		
		int perimeter;		
		perimeter=length*2+width*2;
		
		return (perimeter);
	}

}
