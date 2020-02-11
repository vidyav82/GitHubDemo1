package Jan2020;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
	
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the first Numer a");
		System.out.println();
		
		int a = Sc.nextInt();
		System.out.println("The First Big Number is:"+a);
		System.out.println();
		
		System.out.println("Enter the second Number b");
		int b = Sc.nextInt();
		System.out.println();
		
		if (a>b)
			{
				System.out.println("The First Big Number is"+a);
				System.out.println();
			}
		else
			{
				System.out.println("The second Big Number is"+b);
				System.out.println();
			}
		
		System.out.println("Enter the Third Number c");
		System.out.println();
		int c = Sc.nextInt();
		
		
		
		
		if(a>=b && a>=c)
		{
			System.out.println("The First Big Number is"+a);
			System.out.println();
			
			if(b>=c)
			{
				System.out.println("The second Big Number is"+b);
				System.out.println();
				System.out.println("The Third Big Number is "+c);
				System.out.println();
			}
			else
			{
				System.out.println("The second Big Number is"+c);
				System.out.println();
				System.out.println("The Third Big Number is "+b);
				System.out.println();
			}
			
			
		}
		
		if (b>=a && b>=c)
		{		
			
					System.out.println("The First Bigger Number is"+b);
					System.out.println();
					
					if(a>=c)
					{
						System.out.println("The second Big Number is"+a);
						System.out.println();
						System.out.println("The Third Big Number is "+c);
						System.out.println();
					}
					else
					{
						System.out.println("The second Big Number is"+c);
						System.out.println();
						System.out.println("The Third Big Number is "+a);
						System.out.println();
					}
		}			
		
		if(c>=a && c>=b)
		{
			
			System.out.println("The First Bigger Number is "+c);
			System.out.println();
			
			if(a>=b)
			{
				System.out.println("The second Big Number is"+a);
				System.out.println();
				System.out.println("The Third Big Number is "+b);
				System.out.println();
			}
			else
			{
				System.out.println("The second Big Number is"+b);
				System.out.println();
				System.out.println("The Third Big Number is "+a);
				System.out.println();
			}
			
		}
		Sc.close();
		
}		
}
