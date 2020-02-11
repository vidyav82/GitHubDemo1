package Hackathon;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array of integers check the Palindrome of the series.
		
		System.out.println("Enter 10 integer values to find Palingdrome. \n");
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [10];
		int temp;
		
		for(int i=0;i<a.length;i++) 
		{
			
			a[i] = sc.nextInt();
		}
		
		int Len = a.length-1;
		int j=Len;
		
		for(int i=0;i<Len;i++) 
		{
			
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			
			
		}
		
		System.out.println("The Palingdrome of the given numbers is : \n");
		
		for(int i=0;i<a.length;i++) 
		{
			
			System.out.println(a[i]);
		}
		
		sc.close();
	}

}
