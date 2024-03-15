package javaprogram;

class Room1
{
	float length,width,height;
	byte nWindows;
	
	void setAttr(float l,float w,float h,byte n)
	{
		length=l;
		width=w;
		height=h;
		nWindows=n;
	}
	double area()
	{
		return(length*width);
	}
	
	 void display()
	 {
		 System.out.println(length);
		 System.out.println(width);
		 System.out.println(height);
		 System.out.println("Number of Windows:"+ nWindows);
	 }
}
public class Room{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Room1 r1=new Room1(); 
		 Room1 r2=new Room1();
		 
		 r1.display();
		 r2.display();
		 
		 r1.setAttr(18,11.5f,10,(byte)2);
		 r2.setAttr(14,12,12,(byte)3);
		 
		 r1.display();
		 r2.display();
		 
		 System.out.println("Area of Room with Length"+r1.length+"Width"+r1.width+"is"+r1.area());
		 System.out.println("Area of Room With Length"+r2.length+"Width"+r2.width+"is"+r2.area());
		 
		 

	}

}
