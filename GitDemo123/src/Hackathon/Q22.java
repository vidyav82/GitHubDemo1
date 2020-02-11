package Hackathon;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WJP to convert int to string
		
		String inpStr;
		int Inte;
		
		System.out.println("Enter a Integer.\n");
		
		Scanner sc = new Scanner(System.in);
		
		Inte = sc.nextInt();
		inpStr = Integer.toString(Inte);
				
		System.out.println("The String value of the Integer is : "+inpStr);
		sc.close();
	}

}
