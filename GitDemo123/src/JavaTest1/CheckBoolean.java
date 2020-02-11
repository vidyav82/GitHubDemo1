package JavaTest1;

import java.util.Scanner;

public class CheckBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Consider there is a 3 Boolean variable called a, b, c.
		//Check if at least two out of three Boolean's are true 
		
		System.out.println("Enter 3 boolean Variables. ");
		Scanner sc = new Scanner(System.in);
		
		boolean a;
		boolean b;
		boolean c;
		
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		c = sc.nextBoolean();
		
		//System.out.println(" a =  "+a+" b =  "+b+" c =  "+c+"\n");
		
		if(a == true && b == true && c == true)
		{
			System.out.println("a and b and c are True. \n");
		}
		else if(b == true && c == true)
		{
			System.out.println("b and c are True. \n");
		}
		else if(a == true && c == true)
		{
			System.out.println("a and c are True. \n");
		}
		else if(a == true && b == true )
		{
			System.out.println("a and b are true");
		}
		else
		{
			System.out.println("a, b and c are false.");
		}
		sc.close();	
			
	}

}
