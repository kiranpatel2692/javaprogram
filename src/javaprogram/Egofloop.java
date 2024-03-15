package javaprogram;

public class Egofloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		
		for(int i=100;i>10;i--)
		{
			System.out.println(i);
		}
		
		/* while loop*/
		int i=2;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
		
		// Do while Loop;
		System.out.println("Do while statring");
		int j=5;
		do {
			System.out.println(j);
			j++;
			
		}while(j<50);
		
	}

}
