package Jan2020;

import java.util.Scanner;

public class CountRepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number\n");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//int num = 2112224901; //original number

		int rem = 0;//for store reminder value

		int array[] = new int[10];//array to count digit occurrence

		System.out.println("Input Number :: "+num);

		while(num > 0)
		 {

			rem = num % 10;

			num = num / 10;

			for(int i = 0; i < 10;i++) 
			{

				if(i == rem) 
				{

					array[i]++;

				}

			}

		}

		System.out.println("Output.....");

		System.out.println("Number \t Frequency");

		

		for(int i = 0; i<array.length; i++) {

			int a = array[i];

			if(a!=0) {

				System.out.println(i+" \t "+array[i]);

			}

		}
		sc.close();

	}

}
