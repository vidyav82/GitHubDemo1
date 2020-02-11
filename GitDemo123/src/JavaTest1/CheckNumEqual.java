package JavaTest1;

import java.util.Scanner;

public class CheckNumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the third number: ");
		int c=sc.nextInt();
		System.out.println("Enter the fourth number: ");
		int d=sc.nextInt();
		
		if(a==b && a==c && a==d && b==c && c==d)
		{
			System.out.println("All the 4 numbers are equal.\n");
		}
		else if(a!=b || a!=c || a!=d || b!=c || c!=d)
		{
			System.out.println("All the 4 Numbers are not equal");
		}
		
		sc.close();
	}

}
