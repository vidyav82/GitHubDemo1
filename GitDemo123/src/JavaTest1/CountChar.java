package JavaTest1;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to count the letters, spaces, 
		//numbers and other characters of an input string. 
		
		String inptStr;
		
		
		
		System.out.println("Enter a string with letters spaces and special chars.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inptStr = sc.nextLine();
		
		int letCnt,spaCnt,splChar,strlen,numcnt;
		letCnt=0;
		spaCnt = 0;
		splChar = 0;
		numcnt = 0;
		
		
		strlen = inptStr.length();
		
		inptStr = inptStr.toLowerCase();
		
		
		
		for (int i = 0; i < strlen; i++) 
		{
			   if (Character.isLetter(inptStr.charAt(i)))
			   {
				   letCnt++;
			   }
			   
			   else if (Character.isSpaceChar(inptStr.charAt(i)))
			   {
				   spaCnt++;
			   }
			   else if (Character.isDigit(inptStr.charAt(i)))
			   {
				   numcnt++;
			   }
			 
			   else
			   {
				   splChar++;   
			   }
		}
		
		
		
		System.out.println("Count of alphabets in string is: "+letCnt);
		System.out.println("Count of spaces in string is: "+spaCnt);
		System.out.println("Count of Digits in string is: "+numcnt);
		System.out.println("Count of Other characters in string is: "+splChar);
		sc.close();
	}

}
