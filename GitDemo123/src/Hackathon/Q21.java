package Hackathon;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WJP to convert string to int 
		
		String inpStr;
		int Inte;
		
		System.out.println("Enter a string.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inpStr = sc.nextLine();
		Inte = Integer.parseInt(inpStr);
				
		System.out.println("The Integer value of the String is : "+Inte);
		sc.close();
}
}
