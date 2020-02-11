package Jan2020;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the third number: ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+" and "+c);
		}
		else if(b>c)
		{
			System.out.println(b+" is greater than "+a+" and "+c);
		}
		else
		{
			System.out.println(c+" is greater than "+a+" and "+b);
		}
		sc.close();
	}

}
