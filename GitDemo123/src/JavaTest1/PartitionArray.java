package JavaTest1;

public class PartitionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {7,2,4,1,3,5,6,8,2,10};
		
		int j = 9;
		int temp = 0;
		
		for(int i=0;i<j;i++)
		{
			if(A[i]%2>0)
				{
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j--;
				}
		}
		

		
		for(int i:A)
		{
			System.out.println(" "+i);
		}
		
	}

}
