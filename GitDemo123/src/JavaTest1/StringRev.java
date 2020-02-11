package JavaTest1;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S;
		
		
		
		System.out.println("Enter a string Value to be reversed.\n");
		
		Scanner sc = new Scanner(System.in);
		
		S = sc.next();
		
		int len = S.length();
		char [] origStr = new char [len];
		char [] revStr = new char [len];
		origStr = S.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			revStr[i] = origStr[len-(i+1)];
		}
		
		S = String.valueOf(revStr);
		System.out.println("The reversed string is: "+S);
		sc.close();
		
	}

}
