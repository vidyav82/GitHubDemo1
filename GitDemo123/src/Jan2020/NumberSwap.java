package Jan2020;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st Number  - \n");
		
		Scanner Sc=new Scanner(System.in);
		
		int x = Sc.nextInt();
		
		System.out.println("Enter 2nd Number  - \n");
		
		int y = Sc.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("The 1st Number after swap is  " +x);
		System.out.println("The 2nd Number after swap is  " +y);
		
		Sc.close();
	}

}
