package Jan2020;

import java.util.Scanner;

public class PrintNumberName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number to be Printed to String\n");
		Scanner sc=new Scanner(System.in);
		int Num = sc.nextInt();
		
		String Str = "";

		int length = String.valueOf(Num).length();
		
		
		int[] Digit=new int[20];
		
		
		for(int i=0;i<length;i++)
		{
			
			Digit[i] = Num%10;
			Num=Num/10;
			
		}
		
		for(int i=length-1;i>=0;i--)
		{
			switch (Digit[i])
			{
			case 0:
				Str = Str+" ZERO ";
				break;
			case 1:
				Str = Str+" ONE ";
				break;
			case 2:
				Str = Str+" TWO ";
				break;
			case 3:
				Str = Str+" THREE ";
				break;
			case 4:
				Str = Str+" FOUR ";
				break;
			case 5:
				Str = Str+" FIVE ";
				break;
			case 6:
				Str = Str+" SIX ";
				break;
			case 7:
				Str = Str+" SEVEN ";
				break;
			case 8:
				Str = Str+" EIGHT ";
				break;
			case 9:
				Str = Str+" NINE ";
				break;
				
			}
		}
		
		System.out.println("The String value of the integer entered is:"+Str);
		sc.close();
	}

}
