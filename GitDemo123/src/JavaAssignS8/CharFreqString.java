package JavaAssignS8;

import java.util.HashMap;
import java.util.Scanner;

public class CharFreqString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find the frequency of each character in a given string  
		//String: "Java is an object oriented programming language"
		
	String origStr;
	char [] origChar;
	
	
	System.out.println("Enter a line which needs to be checked.\n");
	
	Scanner sc = new Scanner(System.in);
	
	origStr = sc.nextLine();
	
	origChar = origStr.toCharArray();
		
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
