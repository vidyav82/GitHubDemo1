package Jan2020;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the Array to be sorted");
		
		int N = Sc.nextInt();
		
		int A[] = new int [N];
		//int B[] = new int [N];
		int temp;
		
		System.out.println("Enter the numbers of Array to get sorted ");
		
		for (int a=0;a<N;a++)
		
		{
			A[a] = Sc.nextInt();
		}
		
		System.out.println("The Unsorted array is ");
		
		for (int a=0;a<N;a++)
			
		{
			System.out.println(A[a]);
		}
		
		
												
		for (int i=0;i<N-1;i++)
		{
			for (int j=0;j<N-(i+1);j++)
			{
				if(A[j]>A[j+1])
				{
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			
			}
		}
		
		
		System.out.println("The Sorted Array is :");
		
		for(int i=0;i<N;i++)
		{
			System.out.println(A[i]);
		}
		Sc.close();

	}
	}


