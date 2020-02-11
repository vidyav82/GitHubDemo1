package Hackathon;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given a string print the reverse of the words string.
		//(Input: Java Code Output: Code Java)
		
		String S1 = "Java Code";
		String S2[];
		
		
		
		S2 = S1.split(" ", 2);
		
		int Len = S2.length;
		
		for(int i=0;i<Len;i++)
		{
			String temp[] = new String[2];
			temp[i] = S2[i];
			S2[i] = S2[Len-1];
			S2[Len-1] = temp[i];
			Len--;
		}
		
		System.out.println("The Reversed String is : ");
		
		for(String S:S2)
		{
		System.out.print(" "+S);
		}

	}

}
