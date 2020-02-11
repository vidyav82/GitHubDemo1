package Hackathon;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Given an array prints the unique numbers 
		//and also print the number of occurrences of duplicate numbers.
		
		System.out.println("Enter 10 numbers 1 to 10 except 0. \n");
		
		Scanner sc = new Scanner(System.in);
		int [] A = new int [11];
		int [] B = new int [11];
		int [] C = new int [11];
		
		
		for(int i = 0;i<10;i++)
		{
			A[i] = sc.nextInt();
		}
		
		int temp;
				
	for(int i=0;i<10;i++)
		{ 
			int j = i;
			while(j<9)
			{
			if(A[i] == A[j+1])
				{
				temp = A[i];
				B[temp]++;
				B[temp]++;
				}
			j++;
			}
		}
	
	
	
	
	int temp1;	
	int [] temp3 = new int [10];
	int k;
	for(int i=0;i<10;i++)
	{ 
		int j = i;
		int l = 0;
		temp1 = A[i];
		boolean b = false;
	while(j<=9)
	{
		if(A[i] == A[j+1] || A[i] == temp3[l])
		{
			temp3[l] = A[i];
			b = true;
			break;
		}
		j++;l++;
	}
	if(b == false)
		{
		if(i == 0)
		{
		k = i ;
		} 
		else 
		{
		k = i;
		}
		C[k] = temp1;
		
		}
}
	
		
			
		for(int i=0; i<10;i++)
		{
			if(B[i] != 0)
			{
			System.out.println("The numbers repeated is : "+i+" and number of occurences is "+B[i]);
			}
			else
				if(C[i] != 0)
				{
				System.out.println("The Unique number in the array is "+C[i]);
				}
		}
		sc.close();
	}

}
