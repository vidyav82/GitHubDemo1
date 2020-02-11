package Hackathon;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Given an array of integers, sort the integer values.
		
		System.out.println("Enter 10 integer values. \n");
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [10];
		int temp;
		
		for(int i=0;i<a.length;i++) 
		{
			
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<(a.length-1);i++) 
		{	
			for(int j=0;j<(a.length-(i+1));j++)
			{
			if(a[j]>a[j+1]) 
			{
				
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		}
		System.out.println("The Sorted array is : \n");
		
		for(int i:a) {
			
			System.out.println(i);
		}
		
		sc.close();
	}

}
