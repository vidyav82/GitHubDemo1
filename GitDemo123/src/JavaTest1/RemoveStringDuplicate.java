package JavaTest1;

import java.util.Scanner;

public class RemoveStringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = new String();
		String strDup;
		
		
		System.out.println("Enter the string.");
		Scanner sc = new Scanner(System.in);
		S = sc.nextLine();
		
		
		System.out.println("Enter the string which needs to be removed from above.");
		
		strDup = sc.next();
		int lenDup = strDup.length();
		int index;
		
		StringBuilder Str1 = new StringBuilder(S);
		
		index = Str1.indexOf(strDup);
		int indexend = index+lenDup+1;
	
		Str1=Str1.delete(index,indexend);
		
		
				
		System.out.println("The String after removing the specified string is: "+Str1);
		sc.close();
	
	}

}
