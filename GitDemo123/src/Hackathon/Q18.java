package Hackathon;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WJP to display duplicate character in string.
		
		String inptStr;
		
		System.out.println("Enter a string with duplicate chars.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inptStr = sc.nextLine();
		char S[] = new char[10];
		char c1,c2;
		inptStr = inptStr.toLowerCase();
		
		
		for(int i=0;i<S.length;i++)
		{
			c1=inptStr.charAt(i);
			int b=i+1;
			while(b<S.length)
			{
			c2 = inptStr.charAt(b);
			
			if(c1 == c2)
			{
				S[i] = c2;
			}
			b++;
			}
		}
		
		System.out.println("The duplicate characters in the String is:\n");
		
		for(char j:S)
		{
			if(j == 0)
			{
			continue;
			}
			else
			{
			System.out.println(j);
			}
		}

		sc.close();
	}

}
