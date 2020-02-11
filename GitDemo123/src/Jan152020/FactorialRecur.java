package Jan152020;

import java.util.Scanner;

public class FactorialRecur {
	
	static int Factorial(int N)
	{
		int fact = 1;
		if (N>1)
		fact = N*Factorial(N-1);
		return fact;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number whos Factorial is to be found.");
		Scanner Sc = new Scanner(System.in);
		int N = Sc.nextInt();
		
		int Fact = Factorial(N);
		
		System.out.println("The Factorial of "+N+" is "+Fact);
		Sc.close();

	}

}
