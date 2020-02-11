package Hackathon;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to merge two sorted array.(Do not use third array) 
		//array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8
		//After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
		
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
	
	for(int i:A)
	{
		System.out.println("Merged Array is "+i);
	}
	
	sc.close();
	}


}
