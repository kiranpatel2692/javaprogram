package javaprogram;

public class intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal;
		float rate;
		double duration;
		double maturity;
		double intrest;
		
		principal=50000;
		rate=7.5f;
		duration=3;
		intrest=principal*duration*rate/100;
		maturity=principal+intrest;
		
		System.out.println("Principal Amount=" +principal+"$");
		System.out.println("Diposite Duration=" +duration+"years");
		System.out.println("Intrest Amount=" +intrest);
		System.out.println("Maturity Amount=" +maturity);
		

	}

}
