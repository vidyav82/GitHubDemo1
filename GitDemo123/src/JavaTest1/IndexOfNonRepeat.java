package JavaTest1;

import java.util.Scanner;

public class IndexOfNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java program to find the index of first non-repeating character in a 
		//given string.  Expected Output:Index of first non-repeating 
		//character in 'additional' is: 4 
		
		String S = new String();
				
		System.out.println("Enter the string. \n");
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		
		char c=' ';
		int len,index=0;
		
		len = S.length();
		
		
		for(int i = 0;i<len;i++)
		{
			int j=0;
			int k=0;
			boolean flag = false;
			while(j<len)
			{
				
			if(S.charAt(i) == S.charAt(j))
			{
				k++;
			}
			j++;
			
			}
			if(k<2)
			{
				flag = true;
				c = S.charAt(i);
				index = S.indexOf(c);
				if(flag == true)
					break;
			}
		}
		
		System.out.println("The Index of the non repeating character is: "+index);
		
		sc.close();

	}

}
