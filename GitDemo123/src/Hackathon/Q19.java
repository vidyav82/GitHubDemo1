package Hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //WJP to display number of occurrence of all character
		
String inptStr;
		
		System.out.println("Enter a string.\n");
		
		Scanner sc = new Scanner(System.in);
		
		inptStr = sc.nextLine();
		char [] origChar;
		
		origChar = inptStr.toCharArray();
		
		HashMap<Character,Integer> charHm = new HashMap<>();
		
		for(char chAray:origChar)
		{
			if(charHm.containsKey(chAray))
			{
				int IntVal = 1+charHm.get(chAray);
				charHm.put(chAray,IntVal);
			}
			else
			{
				charHm.put(chAray,1);
			}
		}
		
		System.out.println(charHm);
		sc.close();
	}

}
