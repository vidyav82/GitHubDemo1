package Jan2020;

import java.util.Scanner;

public class ArrayMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the row and columns of the Array");
		
		Scanner sc=new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		

		int a[][]= new int[row][col];
		int b[][]= new int[row][col];
		int c[][]= new int[row][col];
		
		
		System.out.println("Enter the  "+(row*col)+ "  values of array A");
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
			{	
				a[i][j] = sc.nextInt();
		
			}
			}
		System.out.println("Enter the  " +(row*col)+"  values of array B");
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
			{	
			  b[i][j] = sc.nextInt();
		
			}
			}
		System.out.println("The Multiply of A and B is :");
		System.out.println();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j] = a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
				//System.out.println();
			}
			
		System.out.println();
		
		}
		sc.close();
	}

}
