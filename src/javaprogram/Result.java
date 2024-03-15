package javaprogram;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total,subject1,subject2,subject3;
		float per;
		
		subject1=30;
		subject2=36;
		subject3=36;
		total=subject1+subject2+subject3;
		per=((float)total/300)*100;
		
		
		System.out.println("Maths=" +subject1);
		System.out.println("Chemistry=" +subject2);
		System.out.println("Physics=" +subject3);
		System.out.println("Total Marks=" +total);
		System.out.println("Percentage=" +per);
		if(per>=70)
		{
		
			System.out.println("Student Get Distiction:");
		}
		else if(per<=70&&per>=60)
		{
		
			System.out.println("Student Get First Class");
		}	
		
		else if(per<60 &&per>35)
		{
			System.out.println("Student Get Pass Class");
		}
		else
		{
			System.out.println("Student Fail");
		}
		
		
		
	}

}
