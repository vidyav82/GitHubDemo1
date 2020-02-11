package Hackathon;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program which inputs a positive natural number N and prints the possible 
		//consecutive number combinations, which when added give N. 
		//INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4
		
		System.out.println("Enter a Integer.\n");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int N1=0;
		
		for(int i=1;i<N;i++)
		{
		if(i<N)
		{
			N1 = i+(N-i);
		}
	
		System.out.println(N1);
		
		}

		sc.close();
	}

}
