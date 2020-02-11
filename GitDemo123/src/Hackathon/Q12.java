package Hackathon;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to check palindrome (MalayalaM) for both numbers and string?
		
	String S1 = "MalayalaM"	;
	String S2;
	char S3[],temp;
	
	S1 = S1.toLowerCase();
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
	
	if(S1.equals(S2))
	{
		System.out.println("The String given is a Palingdrom.\n");
	}
	else
	
	{
		System.out.println("The String given is not a Palingdrom.\n");
	}
		
}
}
