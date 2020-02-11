package Hackathon;

//import java.util.Arrays;
import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write an algorithm to reverse first 3 numbers, then next 3 numbers, 
		//then next 3 numbers, the number will be based on var k. 
		//Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4].
		
		System.out.println("Enter 10 numbers to be reversed. \n");
		
		int [] A = new int[10];
		int k;
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number which specify how many to be reversed. \n");
		
		k = sc.nextInt();
		int temp;
		
		//Integer.
		
		//Arrays.parallelSort(A, 0, k);
		
		for(int j=0;j<9;j=j+3)
		{
			for(int i=0;i<k-1;i++)
			{
				temp = A[i+j];
				A[i+j] = A[(k+j)-(i+1)];
				A[(k+j)-(i+1)] = temp;
			}
		}
		
				
		
		System.out.println("The reversed Array is: \n");
		
		for(int m : A)
		{
			System.out.println(m);
		}
		
		sc.close();
	}

}
