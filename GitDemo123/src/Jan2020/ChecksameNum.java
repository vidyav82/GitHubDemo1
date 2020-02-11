package Jan2020;

import java.util.Scanner;

public class ChecksameNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Enter the row of the Array");
		
		Scanner sc=new Scanner(System.in);
		
		int row = sc.nextInt();
		
		int a[]= new int[row];
		int b[] = new int[row];
		int c[] = new int[row];
						
		
		System.out.println("Enter the  "+row+ "  values of array A less than: "+row);
		
		for(int i=0;i<row;i++)
			{	
				a[i] = sc.nextInt();
			}
		
		for(int i=0;i<row;i++)
		{	
			b[i] = a[i];
		}
			
		
		
		for(int i=0;i<row;i++)
		{
			
			int temp = a[i];
						
			if(temp==b[i])
		
			c[temp]++;
			
		}
		
		for(int i=0;i<row;i++)
		{
			if(c[i]>0)
			{	
			System.out.println("The Number is "+i+" Count is \t"+c[i]);
			}
		}
		
		sc.close();		
	}

}
