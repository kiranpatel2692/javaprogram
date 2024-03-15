package javaprogram;

public class Car {
	 static int year=2000;
	static String model="Toyota";
	void start()
	{
		System.out.println("Car is Starting");
	}
    void drive()
    {
    	System.out.println("Car is in Motion");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.start();
		c1.drive();
		System.out.println(year);

	}

}
