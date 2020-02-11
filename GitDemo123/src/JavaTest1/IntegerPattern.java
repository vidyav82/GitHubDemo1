package JavaTest1;

import java.util.Scanner;

public class IntegerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number. \n");
		
		Scanner sc = new Scanner(System.in);
		
		int x,sum,xx,xxx,xxxx;
		
		x=sc.nextInt();
		
		xx = x+(x*10);
		xxx = x+(x*10)+(x*100);
		xxxx = x+(x*10)+(x*100)+(x*1000);
		
		sum = x+xx+xxx+xxxx;
		
		System.out.println("The computed value of the input is: "+x+"+"+xx+"+"+xxx+"+"+xxxx+" : "+sum);
		
		sc.close();

	}

}
