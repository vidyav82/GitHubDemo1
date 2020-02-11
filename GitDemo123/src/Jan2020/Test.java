package Jan2020;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a number 1 to 4");
		int n = Sc.nextInt();
		System.out.println("Enter 2 numbers");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c;
		
		switch (n) {
		case 1:
			c=a+b;
			System.out.println("The Sum value of a and b is:"+c);
			break;
		case 2:
			c = a-b;
			System.out.println("The Subtracted value of a and b is:"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("The Multiple value of a and b is:"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("The Divided value of a and b is:"+c);
			break;

		default:
			System.out.println("The Operation cant be performed");
			break;
		}
	Sc.close();	 
}
}
