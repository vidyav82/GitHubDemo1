package Hackathon;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) *
		
		String S1 = "Java Code";
		String S2;
		char S3[],temp;
		
		S3 = S1.toCharArray();
		int Len = S3.length;
		
		for(int i=0;i<Len;i++)
		{
			temp = S3[i];
			S3[i] = S3[Len-1];
			S3[Len-1] = temp;
			Len--;
		}
		
		S2 = String.valueOf(S3);
		
		System.out.println("The Reversed String is : \n"+S2);

	}

}
