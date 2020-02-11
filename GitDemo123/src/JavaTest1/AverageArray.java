package JavaTest1;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1, 4, 20, 7, 25, 35, 100};
		
		int avg = 0;
		
		int B[] = new int[10];
		
		for(int i=0;i<=6;i++)
		{
			avg = avg+A[i];
			
		}
		
		avg = avg/7;
		System.out.println(avg);
		
		for(int i=0;i<=6;i++)
		{
			if(A[i]>avg)
			{
				B[i] = A[i];
			}
			
		}
		System.out.println("The Average of all numbers is : \n"+avg);
		System.out.println("The numbers greater than the average is: \n");
		
		for(int i=0;i<=6;i++)
		{
			if(B[i]!=0)
			{
				System.out.println(B[i]);	
			}
		}
 	}

}
