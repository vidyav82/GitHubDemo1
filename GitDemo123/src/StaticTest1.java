
 class StaticTest1 {
	
	public static void Operation(int a,int b)
	{
		System.out.println("Add  "+(a+b));
	}
	
	public static void Operation(int a)
	{
		System.out.println("Square of Num  "+(a*a));
	}
	
	public static void Operation(double a)
	{
		System.out.println("Sum of Float Values  "+(a+10));
	}
	
	
	public static void main(String[] args) 
	{
		Operation(10,20);
		Operation(4);
		Operation(3.2);
	}
}


	
	

