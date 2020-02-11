package Hackathon;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WJP to perform ascending order Selection sort *
		
		System.out.println("Enter 10 numbers. \n");
		
		Scanner sc = new Scanner(System.in);
		int [] A = new int [10];
		
		
		for(int i = 0;i<A.length;i++)
		{
			A[i] = sc.nextInt();
		}
		
	    for (int i = 0; i < A.length; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < A.length; j++)
            {  
                if (A[j] < A[index])
                {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = A[index];   
            A[index] = A[i];  
            A[i] = smallerNumber;  
            
            System.out.println("The sorted order is. \n");
            
            for(int j = 0;j<A.length;j++)
    		{
    			System.out.println(A[j]);
    		}
            
        }
	sc.close();
	}

}
