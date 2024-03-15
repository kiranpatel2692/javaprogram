package javaprogram;

public class Rectangle {   //Constructor Program
	int length,width;
	
	public Rectangle(int l,int w) {
		length=l; //this.length  write for same name declare variable;
		width=w;
		
	}
	public int calculatearea()
	{
		return length*width;
	}
	
	public double area() {
		return 5.7*6;

	}
	

	public static void main(String[] args) {
	
		Rectangle r1=new Rectangle(5,6);
		Rectangle r2=new Rectangle(6,8);
		
		System.out.println(r1.calculatearea());
		System.out.println(r2.calculatearea());
				
		

	}

}
