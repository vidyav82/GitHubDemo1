package Jan2020;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter one Amount $1 to $1000 \n");
		
		Scanner Sc = new Scanner(System.in);
		
		int N = Sc.nextInt();
		
		if(N>0 && N<51)
		{
			
			System.out.println("For Amount $1 upto $50 the Discount offered is  "+"2%\n");
			
		}
		else if(N>50 && N<150)
		{
			System.out.println("For Amount $51 upto $149 the Discount offered is  "+"5%\n");
		}
		
		else if(N>149 && N<250)
		{
			System.out.println("For Amount $150 upto $249 the Discount offered is  "+"10%\n");
		}
			
		else if(N>249 && N<601)
		{
			System.out.println("For Amount $250 upto $600 the Discount offered is  "+"15%\n");
		}
		else if(N>599 && N<801)
		{
			System.out.println("For Amount $600 upto $800 the Discount offered is  "+"20%\n");
		}
		else if(N>799)
		{
			System.out.println("For Amount $800 and greater the Discount offered is  "+"25%\n");
		}
		Sc.close();
	}

}
