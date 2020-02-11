package JavaJan2020;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "Welcome.to.the.world";
		String S2[];
		S2 = Str.split("\\.", 4);
		for(String i:S2)
		{
		System.out.println("Return Value : "+i);
		}
		

	}

}
