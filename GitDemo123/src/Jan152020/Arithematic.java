package Jan152020;

import java.util.Scanner;

public class Arithematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 2 numbers which needed the operations to be performed. \n");
		Scanner Sc = new Scanner(System.in);
		
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c;
		
		System.out.println("Enter the operations to be performed for the 2 numbers entered. \n");
		
		String Op = new String();
		Op = Sc.next();
		
		switch (Op) {
		case "Add":
			c=a+b;
			System.out.println("The Addition of two numbers is: \t"+c);			
			break;
		case "Sub":
			c=a-b;
			System.out.println("The Subtracted value of 2 sumbers is: \t"+c);
			break;
		case "Multiply":
			c=a*b;
			System.out.println("The product of 2 numbers is: \t"+c);
			break;
		case "Div":
			c=a/b;
			System.out.println("The Division of 2 numbers is: \t"+c);
			break;
		default:
			break;
		}
		Sc.close();
		
	}

}
