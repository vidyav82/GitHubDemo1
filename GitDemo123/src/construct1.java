
public class construct1 {
	
	int a = 10;
	
	construct1(int i)
	{
		System.out.println("The Constructor Method "+i);
	}
	
	public static void main(String[] args) {
		
		construct1 ob = new construct1(20);
		System.out.println(ob.a);
	}
}
