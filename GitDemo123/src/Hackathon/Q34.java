package Hackathon;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a method to implement *, - , / operations. 
		//You should use only the + operator
		
		int a,b;
		String op;
		System.out.println("Enter 2 Numbers.\n");
		
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter the operation to be performed on the numbers as Add or Sub or Multiply or Div\n");
		
		op = sc.next();
		
		if(op.equals("Add"))
			
		{
			System.out.println("The Addition of numers entered is: "+(a+b));
		}
		else if(op.equals("Sub"))
		{
			int c = a+Math.negateExact(b);
			System.out.println("The Subtraction of a and b is "+c);
		}
		else if(op.equals("Multiply"))
		{
			int c=0;
			for(int i=1;i<=b;i++)
			{
				c = c+a;
			}
			System.out.println("The Value of Multiples is: "+c);	
		}
		else if(op.equals("Div"))
		{
			int c = 0;
			int sum=0;
			while(sum < a)
			{
				sum = sum+b;
				c++;
			}
			System.out.println("The Division of 2 numbers is : "+c);
		}
			
		
		sc.close();
	}

}
