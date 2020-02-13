
public class TestThis {
	
	int MyNum1 = 10;
	int MyNum2 = 20;
	
	public void Add(int MyNum1,int MyNum2)
	{
		System.out.println("The Sum of 2 numbers is"+(this.MyNum1+this.MyNum2));
	}
	
	
}
 class NewTest{
	 
	 static int MyNum1 = 15;
	 static int MyNum2 = 25;
	 int a = 20;
	 int b = 30;
	 
	 public void NewTest2(int a, int b)
	 {
		 System.out.println("The Addition of Numbers in constructor is "+(this.a+this.b));
		
	 }
	
	public static void main(String[] args) {
		
		int a = 16;
		int b = 26;
		
		TestThis op = new TestThis();
		NewTest op1 = new NewTest();
		
		
		op.Add(MyNum1,MyNum2);
		op1.NewTest2(12,13);
		System.out.println("The Sum of a and b are "+(a+b));
		
		
	}
}

