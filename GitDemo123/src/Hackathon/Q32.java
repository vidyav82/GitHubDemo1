package Hackathon;


import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You are given two sorted arrays, A and B, and A has a large enough 
		//bu#er at the end to hold B. Write a method to merge B into A in 
		//sorted order.
		
		int [] A = new int[10];	
		int [] B = new int[10];
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Array A.\n");
	
	for(int i=0;i<10;i++)
	{
		A[i] = sc.nextInt();
	}
	
	System.out.println("Enter Array B.\n");
	
	for(int i=0;i<10;i++)
	{
		B[i] = sc.nextInt();
	}
	
	for(int i=0;i<10;i++)
	{
		if(A[i] == 0)
		{
			A[i] = B[i];
		}
	}
	
	System.out.println("Merged Array before sorting is \n");
	
	for(int i:A)
	{
		System.out.print(i);
	}
	
	for(int i=0;i<9;i++)
	{
		int temp = 0;
		for(int j=0;j<10-(i+1);j++)
		{
			if(A[j]>A[j+1])
			{
				temp = A[j];
				A[j] = A[j+1];
				A[j+1] = temp;
			}
		}
	}
	
	System.out.println("\nThe Sorted Array after merging is: ");
	
	for(int i:A)
	{
		System.out.print(i);
	}
	
		sc.close();
	}

}
