package JavaTest1;

import java.util.Scanner;

public class Circumcir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the radius of the circle. \n");
		
		Scanner sc = new Scanner(System.in);
		
		double r,cir,pi;
		pi = 3.14159;
		r = sc.nextDouble();
		
		cir = 2*pi*r;
		
		System.out.println("The circumference of the circle is:  "+cir);
		sc.close();
	}

}
