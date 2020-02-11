package Hackathon;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to differentiate input as string, int or bool
		
		String inpStr;
		int Inte;
		boolean val;
		
		System.out.println("Enter a Integer.\n");
		
		Scanner sc = new Scanner(System.in);
		
		Inte = sc.nextInt();
		
		if(Inte == (int)Inte)
		{
			System.out.println("The Value entered is an integer type.");
		}
		else
		{
			System.out.println("The Value entered is not an integer type.");
		}
		
		System.out.println("Enter a String.\n");
					
		inpStr = sc.next();
		
		if(inpStr == (String)inpStr)
		{
			System.out.println("The Value entered is a String Type.");
		}
		else
		{
			System.out.println("The Value entered is not a String type.");
		}
		System.out.println("Enter a Boolean value.\n");
		
		val = sc.nextBoolean();
		
		if(val == (boolean)val)
		{
			System.out.println("The Value entered is a Booolean Type.");
		}
		else
		{
			System.out.println("The Value entered is not a Boolean type.");
		}
		
		
		sc.close();
	}

}
