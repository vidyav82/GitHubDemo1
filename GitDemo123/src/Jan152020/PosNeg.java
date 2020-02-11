package Jan152020;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number to find if its Positive or Negative");
		Scanner Sc = new Scanner(System.in);
		
		int A = Sc.nextInt();
		
		if(A>0)
		{
			System.out.println("The Number Entered is a Positive Number.");
		}
		else if(A<0)
		{
			System.out.println("The Number Entered is a Negative Number.");
		}
		else if(A==0)
		{
			System.out.println("The Number Entered is 0.");
		}
		Sc.close();
	}

}
