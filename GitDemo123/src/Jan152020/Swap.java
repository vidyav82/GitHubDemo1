package Jan152020;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 2 numbers which needs to be swapped.\n");
		Scanner Sc = new Scanner(System.in);
		
		int a,b;
		a = Sc.nextInt();
		b = Sc.nextInt();
		System.out.println("The Number before Swap is a = "+a);
		System.out.println("The Number before Swap is b = "+b);
		
		b=a*b; 
		a=b/a; 
		b=b/a;
		
		System.out.println("The Number After Swap is a = "+a);
		System.out.println("The Number After Swap is b = "+b);
		
		Sc.close();
		
	}

}
