package Jan2020;

import java.util.Scanner;

public class ArrayLSNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 10 Numbers \n");
		
		Scanner Sc = new Scanner(System.in);
		
		int a[] = new int [10] ;
		int LNum = 0;
		int Snum = 10;
		
		for (int i=0;i<10;i++)
		{
			a[i] = Sc.nextInt();
		}
		
		for(int i=0; i<10;i++)
		{
						
			if(a[i]>LNum)
			{	
			LNum = a[i];
			}
			
			if (a[i]<Snum)
			{
				Snum = a[i];
			}
			
				
		}
		
				
		System.out.println("The Largest number in the list is: "+LNum+"\n");
		System.out.println("The Smallest number in the list is: "+Snum+"\n");
		Sc.close();
	}

}
