package JavaTest1;

import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Enter a Number \n");
		
		Scanner Sc=new Scanner(System.in);
		
		int N = Sc.nextInt();
		
		for(int i=1;i<=N;i++)
		{
			int Cube = i*i*i;
			System.out.println("The Cube of "+i+"\tis\t"+Cube);
		}
		Sc.close();

	}

}
