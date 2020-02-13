
public class PassByRef {
	int data = 50;
	
	void change(PassByRef op)
	{
		op.data = op.data+100;
		System.out.println(op.data);
	}
	
	public static void main(String[] args) {
		
		PassByRef op = new PassByRef();
		
		System.out.println("Before change "+op.data);
		op.change(op);
		System.out.println("After change "+op.data);
	}

}
