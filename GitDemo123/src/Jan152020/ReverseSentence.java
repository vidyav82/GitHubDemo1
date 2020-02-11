package Jan152020;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Hi I am Vidya";
		
		String S1[] = S.split(" ");
		
		String[] S2 = new String[4];
		S2[0] = S1[3];
		S2[1] = S1[2];
		S2[2] = S1[1];
		S2[3] = S1[0];
				
		System.out.println(S2[0]+" "+S2[1]+" "+S2[2]+" "+S2[3]);
		
		
	}

}
