package Jan2020;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the length of the pattern");
		Scanner Len=new Scanner(System.in);
		int l = Len.nextInt();
		
		
		System.out.println("Enter the pattern char: ");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		System.out.println("The Pattern is:");
		System.out.println();
		
		for(int i=0;i<l;i++)
			
		{
			for(int j=0;j<=i;j++)
			{
		  System.out.print(a);
			}
			
			System.out.println();
		}
		sc.close();
		Len.close();
	}

}
