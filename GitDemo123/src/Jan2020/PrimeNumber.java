package Jan2020;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number to be found Prime or Not");
		
		Scanner Sc = new Scanner(System.in);
		
		int N = Sc.nextInt();
		
		if (N == 1 || N == 0)
		{
		System.out.println("The Number is not Prime");
		}
		else if (N == 2 || N == 5 || N ==3 || N ==7)
		{
			System.out.println("The Number is Prime");
			
		}
		else if(N%2 == 0 || N%5 == 0 || N%3 == 0 || N%7 == 0)
		{
			System.out.println("The Number is not Prime");
		}
		else	
			System.out.println("The Number is Prime");
		Sc.close();
		}		

	}


