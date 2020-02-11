package JavaAssignS8;

public class GeneralStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//implement Generic Stack.
		
		int [] A = new int [5];
		
		for(int i=0;i<=A.length-1;i++) {
			A[i] = i+1;
			
		}
		
		for(int i=A.length-1;i>=0;i--) {
			System.out.println(A[i]);
		}
		
	}

}
