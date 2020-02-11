package Jan2020;

import java.util.Scanner;

public class Assignment1Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		
		System.out.println("Enter the Number untill which you need to print - \n");
		//System.out.println();
		
		Scanner Sc=new Scanner(System.in);
		
		int N = Sc.nextInt();
		int j=0;
		
		while(j<=N)
		{
			System.out.println(j);
			j++;
		}	
		Sc.close();

	}

}
