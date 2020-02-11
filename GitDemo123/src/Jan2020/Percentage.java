package Jan2020;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number of classes held\n");
		
		Scanner Sc=new Scanner(System.in);
		
		int Classes = Sc.nextInt();
		
		System.out.println("Enter a Number of classes attended\n");
		
		int attend = Sc.nextInt();
		
		int Percent = attend*100/Classes;
		
		System.out.println("The Percentage of classes attended is: \t"+Percent);
		
		if(Percent>75)
		
			System.out.println("The student is allowed to sit in the exam");
		else
			System.out.println("The Percent is less than 75% so not allowed to write Exams");
	Sc.close();
	}

}
