package Jan152020;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 10 elements to be added. \n");
		
		Scanner Sc = new Scanner(System.in);
		int Sum=0;
		
		int a[] = new int [10];
		
		for(int i=0;i<10;i++)
		{
			a[i] = Sc.nextInt();
		}
		
		
		for(int i=0; i<10;i++)
		{
			Sum = Sum+a[i];
		}
		
				
		System.out.println("The Sum of the Numbers entered are : "+Sum);
		
		Sc.close();

	}

}
