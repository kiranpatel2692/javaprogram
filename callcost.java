package javaprogram;

public class callcost
{
	public static void main(String[] args)
	
	{
		double balance,rate,cost,duration,seconds,Balance;
		
		balance=175;
		rate=1.4;
		duration=39;
		cost=duration*rate;
		Balance=balance-cost;
		seconds=60*duration;
		
		System.out.println("Total Balance ="+balance);
		System.out.println("Call Duration ="+duration);
		System.out.println("Seconds ="+seconds);
		System.out.println("Avialable Balance ="+Balance+"Rupees");
	}
	

}
