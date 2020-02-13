 class newstat1 
 {

	public static void Temp(int n)
		{
			System.out.println("I have 5 cars");
			n = n+10;
			System.out.println(n);
		}

	}

	 class newstatchild1 extends newstat1
	 {
		
		public static void Temp(int a)
		{
			System.out.println("I have 10 cars");
			a = a+2;
			System.out.println(a);
		}
		
		public static void main(String[] args) 
		{
			System.out.println("The inherited program overrides the parent method");
			Temp(10);
		}
	}




