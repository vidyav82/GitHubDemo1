package Hackathon;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a function to find out longest palindrome in a given string.
		
		System.out.println("Enter a string with palingdrome strings.\n");
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		String str[] = S.split(" ");
		
		int Len = str.length;
		int Len1[] = new int [Len];
		
		int keyval;
		
		
		TreeMap<Integer,String> Tp = new TreeMap<Integer,String>();
		
		for(int i=0;i<Len;i++)
		{
			Len1[i] = str[i].length();
		}
		
		for(int i=0;i<Len1.length;i++)
		{
			Tp.put(Len1[i], str[i]);
		}
	
		keyval =  Tp.lastKey();
		String longeststr = Tp.get(keyval);
		
		StringBuffer Str = new StringBuffer(longeststr); 
		
		if(Str.equals(Str.reverse())) {
			System.out.println("The Palingdrome of longest String is : "+Str);
		}
		else
		{
			System.out.println("The Longest String is not a Palingdrome.");
		}
		
		
		sc.close();

	}

}
