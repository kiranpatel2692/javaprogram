package javaprogram;

public class Variableeg {
	void printnumber() {
		int a=10;
		static int f=40;
		System.out.println(a);
	}
	void sumnumber() {
		int n=20;
		int m=10;
		int p=n+m;
		System.out.println(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variableeg v1=new Variableeg();
		v1.printnumber();
		v1.sumnumber();
        System.out.println(Variableeg.f);
	}

}
