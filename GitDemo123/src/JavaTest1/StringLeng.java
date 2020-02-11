package JavaTest1;

import java.util.Scanner;

public class StringLeng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to find the length of last word of a given string. 
		//The string contains upper/lower-case alphabets and empty space characters ' '. 
		//Sample Output:Original String: The length of first letter Length of the last word of the above string: 6  

		
		String S = new String();
		
		System.out.println("Enter the string.\n");
		Scanner sc = new Scanner(System.in);
		
		S = sc.nextLine();
		
		StringBuffer Str = new StringBuffer(S);
		
		int Len = S.length();
		int indexofSpace;
		int LenofLastString;
		indexofSpace=Str.lastIndexOf(" ");
		
		
		LenofLastString = Len - (indexofSpace+1);
		
		System.out.println("The Length of last string is: "+LenofLastString);
		
		sc.close();
	}

}
