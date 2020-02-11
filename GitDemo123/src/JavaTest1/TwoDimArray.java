package JavaTest1;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WJP to print an array after changing the rows and columns of a given 
//two-dimensional array. Original Array: 40 20 60 10 20 50 After changing 
//the rows and columns of the said array:Output:10 40 20 20 50 60 
		
		int [][] A = {{40,20,60},{10,20,50}};
		int B[][] = new int [3][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				B[j][i] = A[i][j];
			}
		}
		
		System.out.print("The Original Array is : \n");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
			System.out.print(A[i][j]);
			
			}
			System.out.println();
		}
		
		System.out.print("The changed Array is : \n");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				
			System.out.print(B[i][j]);
			
			}
			System.out.println();
		}
	}

}
