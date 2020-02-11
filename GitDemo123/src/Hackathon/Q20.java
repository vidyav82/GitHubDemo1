package Hackathon;


import java.util.HashMap;
import java.util.Scanner;


public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to find total number of repeated integers, 
		//uppercase and lowercase character in the give string
		
		
		String inpStr;
		
		System.out.println("Enter a string.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inpStr = sc.nextLine();
		char [] chars;
		
		
		chars = inpStr.toCharArray();
		
		
		
		HashMap<Character,Integer> Hp = new HashMap<Character,Integer>();
		
		for(char chAray:chars)
		{
			if(Hp.containsKey(chAray))
			{
				int IntVal = 1+Hp.get(chAray);
				Hp.put(chAray,IntVal);
			}
			else
			{
				Hp.put(chAray,1);
			}
		}
		
	
	    System.out.println("The Output is:");
	    
	   System.out.println(Hp);		
	    sc.close();
	}

}
