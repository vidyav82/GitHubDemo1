package Jan2020;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter 5 Numbers \n");
		
		Scanner Sc=new Scanner(System.in);
		
		int Num[] = new int [5];
		int Sum = 0;
		double Avg = 0.0;
		
		for(int i=0;i<5;i++)
		{
			Num[i] = Sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			
			Sum = Sum+Num[i];
			Avg = Sum/5;
			
		}	
		System.out.println("The Sum of 5 Numbers is  Sum = "+Sum);
		System.out.println("The Average of 5 Numbers is  Avg = "+Avg);
		
		Sc.close();
	}

}
