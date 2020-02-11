package JavaTest1;

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to check if a string starts with a specified 
		//word Sample Data: string1 = "Hi this is a java exam Question?" 
		//Sample Output: True
		
		String inptStr;
		
		String veriStr;
		
		System.out.println("Enter a string.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inptStr = sc.nextLine();
		
		System.out.println("Enter the string to check at start.\n");
		
		veriStr = sc.next();
		
		if(inptStr.startsWith(veriStr))
		{
			System.out.println("The string starts with the given string. "+veriStr);
		}
		else
		{
			System.out.println("The string does not start with the given string. "+veriStr);
		}
			
		sc.close();
	}

}
