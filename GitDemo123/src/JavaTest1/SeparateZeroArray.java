package JavaTest1;

public class SeparateZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int A[] = {0, 8, 4, 0, 1, 9, 6, 0};
		
		int j = 7;
		int temp = 0;
		
		for(int i=0;i<j;i++)
		{
			if(A[i]==0)
				{
				temp = A[i];
				if(A[j]!=0)
				{
				A[i] = A[j];
				A[j] = temp;
				}
				else
				{
					A[i]=A[i+1];
					A[i+1]=temp;
				}
				j--;
				}
		}
		

		
		for(int i:A)
		{
			System.out.println(" "+i);
		}
		
	}

}
