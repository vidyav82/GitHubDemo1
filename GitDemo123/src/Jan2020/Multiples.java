package Jan2020;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number which need multiples\n");
		
		Scanner Sc=new Scanner(System.in);
		
		int N = Sc.nextInt();
		
		
		
		if(N == 0)
		{
			System.out.println("Please enter a number greater than 0");
		}
		else if (N>0)
		{
			System.out.println("The Multiples of " +N +" is :\t " );
		for(int i=1;i<=10;i++)
		{
		 int Res = 1;
		 Res = N*i;
		 
		 System.out.println(N+"*"+i+"  = "+Res);
		}
		}
		Sc.close();
	}

}
