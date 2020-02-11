package Jan2020;

import java.util.Scanner;

public class TestCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 20 Numbers \n");
		
		Scanner Sc = new Scanner(System.in);
		
		int a[] = new int [20] ;
		int p = 0;
		int n = 0;
		int e = 0;
		int o = 0;
		int z = 0;
		
		for (int i=0;i<20;i++)
		{
			a[i] = Sc.nextInt();
		}
		
		for (int i=0;i<20;i++)
		{
			int Num = a[i];
			if(a[i] == 0)
				z++;
			else if(a[i]>0)
			{
				p++;
				if(Num%2 == 0)
				{
					e++;
				}
				else if(Num%2 > 0)
				{
					o++;
				}
			}
			else if(a[i]<0)
				n++;
			
			
		}
		System.out.println("The Number of Zeros in the list is: "+z+"\n");
		System.out.println("The Number of Positive Numbers in the list is: "+p+"\n");
		System.out.println("The Number of Negative Numbers in the list is: "+n+"\n");
		System.out.println("The Number of Even Numbers in the list is: "+e+"\n");
		System.out.println("The Number of Odd Numbers in the list is: "+o+"\n");
		Sc.close();
	}

}
