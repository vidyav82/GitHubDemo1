package Jan152020;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number untill which you want to print the Fibonacci Series. ");
		Scanner Sc = new Scanner(System.in);
		int N = Sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.println(a+"\n"+b);
		
		for(int i=2;i<=N;i++)
		{
			int n = a+b;
			System.out.println(n);
			a=b;
			b=n;
			
		}
		
		Sc.close();
	}

}
