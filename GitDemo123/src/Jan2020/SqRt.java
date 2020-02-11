package Jan2020;

import java.util.Scanner;

public class SqRt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number whos squareroot  is to be found");
		
		Scanner Sc = new Scanner(System.in);
		double N = Sc.nextDouble();
		
		double S = Math.sqrt(N);
		
		System.out.println("The Square Root of " + N + " is = "+S);
		
		Sc.close();
		}


}
