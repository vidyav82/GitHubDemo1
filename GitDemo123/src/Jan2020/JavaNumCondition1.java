package Jan2020;

import java.util.Scanner;

public class JavaNumCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number \n");
		
		Scanner Sc=new Scanner(System.in);
		
		int N1 = Sc.nextInt();
		
		if(N1%2 == 1)
		{
			System.out.println("Weird Odd");
		}
		else if(N1%2 == 0)
		{
			if (N1>=2 && N1<5)
			{	
			System.out.println("Not Weird 2-4");
			}
			
			else if (N1>=6 && N1<=20)
			{
				System.out.println("Weird 6-20");
			}
			
			else if(N1>20)
			{
				System.out.println("Not Weird >20 ");
			}
		}
		Sc.close();
	}

}
