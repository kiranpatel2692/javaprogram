package javaprogram;

public class ConstctorEg {
	String Brand,Model;
	int year;
	
	public ConstctorEg() //Default parameter;
	{
		Brand="Toyota";
		Model="HighLander";
		year=2024;
		
	}
	public ConstctorEg(String BrandName,String ModelName,int yr) {
		Brand=BrandName;
		Model=ModelName;
		year=yr;
		
	}
	public void Displaydetail()
	{
		System.out.println(Brand);
		System.out.println(Model);
		System.out.println(year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstctorEg c1=new ConstctorEg();
		ConstctorEg c2=new ConstctorEg("BMW","X7",2024);
		ConstctorEg c3=new ConstctorEg("Kia","Carnival",2023);
		
		c1.Displaydetail();
		c2.Displaydetail();
		c3.Displaydetail();
		

	}

}
