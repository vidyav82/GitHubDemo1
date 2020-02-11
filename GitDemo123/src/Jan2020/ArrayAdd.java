package Jan2020;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{20,30,40},{10,20,15},{25,16,9}};
		int b[][]= {{10,20,30},{12,14,16},{2,4,5}};
		int c[][]= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				//System.out.println();
			}
			
		System.out.println();
		
		}
		
	}

}
