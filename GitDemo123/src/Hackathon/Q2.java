package Hackathon;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number which needs factorial. \n");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Fact = 1;
		
		while(N>=1) {
			
			Fact = Fact*N;
			N--;		
			
		}
	System.out.println("The Factorial  "+Fact );
	
	sc.close();
		
	}
}
