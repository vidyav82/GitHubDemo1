package Jan2020;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number for which you need to find the Factorial\n");
		
		Scanner Sc=new Scanner(System.in);
		
		int N = Sc.nextInt();
		
		int Fact=1;
		
		if(N==0)
		{
			System.out.println("The Factorial cant be found.Enter a Number above 0\n");
		}
		else
		{	
		for(int i=0;i<N;i++)
		{
			Fact=Fact*(N-i);
			
		}
		
		System.out.println("The Factorial of " +N+ " is = "+Fact);
		}
		Sc.close();
	}

}
