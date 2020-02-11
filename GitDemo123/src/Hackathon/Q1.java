package Hackathon;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the values of 3 boolean values.\n");
		Scanner sc = new Scanner(System.in);
		
		boolean a;
		boolean b;
		boolean c;
		
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		c = sc.nextBoolean();
		
		if(a == true && b==true)
		{
			System.out.println("a and b are true.\n");
		}
		else if(b==true || c==true) 
		{
			System.out.println("b and c are true.\n");
		}
				
		else if (a==true && c==true) 
		{
			System.out.println("a and c are true");
		}
			
		
		
		sc.close();
	}

}
