package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//WJP to perform ascending order Quick sort 
		
		System.out.println("Enter the 10 Array values.\n");
		
			int[] arr = new int[10];
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			quickSort(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
			
	sc.close();
}

	

			public static void quickSort(int[] arr, int start, int end)
			{
			int partition = partition(arr, start, end);
			if(partition-1>start) 
			{
			quickSort(arr, start, partition - 1);
			}
			if(partition+1<end) 
			{
			quickSort(arr, partition + 1, end);
			}
			}
			
			
			public static int partition(int[] arr, int start, int end)
			{
			int pivot = arr[end];
			for(int i=start; i<end; i++)
			{
			if(arr[i]<pivot)
			{
			int temp= arr[start];
			arr[start]=arr[i];
			arr[i]=temp;
			start++;
			}
			}
			int temp = arr[start];
			arr[start] = pivot;
			arr[end] = temp;
			 return start;
			}

}
