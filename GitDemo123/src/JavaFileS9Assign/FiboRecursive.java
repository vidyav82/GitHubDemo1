package JavaFileS9Assign;

import java.util.Scanner;


public class FiboRecursive {
	static int n1=0,n2=1,n3=0;
	
	public static void fibonacii(int n)
	{
		if(n>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fibonacii(n-1);    
	     }    
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A;
		
		
		
		System.out.println("Enter a number till which you need to find Fibonacci.\n");
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		
		System.out.print(n1+" "+n2);//printing 0 and 1    
		fibonacii(A-2);
		
		
		
		sc.close();

	}

}
