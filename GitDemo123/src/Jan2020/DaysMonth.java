package Jan2020;

import java.util.Scanner;

public class DaysMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Year\n");
		
		Scanner Sc=new Scanner(System.in);
		
		int Year = Sc.nextInt();
		
		System.out.println("Enter the Month of the Year\n");
		
		String Mon = Sc.next();
		String Month = Mon.substring(0,3);
		
		
		String M1[] = {"Jan","Mar","May","Jul","Sep","Nov"};
		String M2[] = {"Apr","Jun","Aug","Oct","Dec"};
		String M3 = "Feb";
		
		if (Month.equals(M3))
		{
		if(Year%4 == 0)
		
			System.out.println("This year is a leap year and Days of month is 29");
		
		else
			System.out.println("This Year is not a leap year and Days of month is 28");
		}
		
		for(int i =0; i<6;i++)
		{
			if(Month.equals(M1[i]))
		
			System.out.println("The Days of the Month is 31");
		
		}
		
		for(int i =0; i<5;i++)
		{
			if(Month.equals(M2[i]))
		
			System.out.println("The Days of the Month is 30");
		}
		Sc.close();
	}

}
