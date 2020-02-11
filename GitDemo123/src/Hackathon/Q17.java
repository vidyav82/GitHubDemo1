package Hackathon;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WJP to find total number of integers, 
		//uppercase and lowercase character in the give string .
		
		String S;
		int low= 0;
		int upp= 0;
		int integers=0;
		
		System.out.println("Enter a String.\n");
		
		Scanner sc = new Scanner(System.in);
		
		S = sc.nextLine();
		char c;
		
		
		
		for(int i=0;i<S.length();i++)
		{
			c = S.charAt(i);
		if(Character.isLowerCase(c)) 
		{
			low++;
		}
		else if(Character.isUpperCase(c))
		{
			upp++;
		}
		else if(Character.isDigit(c))
		{
			integers++;
		}
		}

		System.out.println("The Number of Lower case chars in String is: "+low);
		System.out.println("The Number of Upper case chars in String is: "+upp);
		System.out.println("The Number of Integers in String is: "+integers);
		
		sc.close();
	}

}
