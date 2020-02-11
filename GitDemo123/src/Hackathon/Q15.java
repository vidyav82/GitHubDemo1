package Hackathon;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given a string print the unique words of the string. 
		
		System.out.println("Enter the String which need to find the unique string.\n");
		
		Scanner sc = new Scanner(System.in);
				
		String Str = sc.nextLine();
		String Uniq = " ";
		int index;
		
		String Str2[] = Str.split(" ");
		int Len = Str2.length-1;
		
		for(int i=0;i<=Len;i++)
		{
			String temp = Str2[i];
			index = Str.indexOf(temp, i);
						
			if(index !=0 )
			{
				Uniq = Str2[i+1];
			}
			Len--;	
		}
		
		System.out.println("The Unique word in the string is: "+Uniq);
		
		sc.close();
	}

}
