package Jan152020;

public class Stringperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Vidya";
		String S2 = "Vidya123";
		String Str1 = new String("Java");
		String Str2 = new String("Java123");
		//S1 = "Vidya Venkatesh";
		
		
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		//System.out.println(S1.equals(S2));
		//System.out.println(S1==S2);
		System.out.println(S1=S2);
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		System.out.println("---------------------");
		//System.out.println(Str1.equals(Str2));
		//System.out.println(Str1==Str2);
		System.out.println(Str1=Str2);
		System.out.println(Str1.hashCode());
		System.out.println(Str2.hashCode());
		
		

	}

}
