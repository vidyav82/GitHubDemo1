package Jan2020;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the String Value to be Reversed");
		 
		String A = Sc.nextLine();
		
		int Len = A.length();
		
		char[] ch=A.toCharArray();
				
		System.out.println(Len);
		
		for(int i=0;i<(Len/2);i++)
		{
			char B = ch[i];
			ch[i]=ch[Len-(i+1)];
			ch[Len-(i+1)]=B;
			
		}
		System.out.println("The Reversed String is ");
		
		for(int i=0;i<Len;i++)
		{
			System.out.print(ch[i]);
		}
			
		Sc.close();
	}

	

}
