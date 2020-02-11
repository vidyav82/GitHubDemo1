package JavaAssignS8;


import java.util.Scanner;
import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Stack Implementation
		 * 
Implement generic stack 
Find factorial of given number using single stack 
Reverse the given string using stack 
Implement the dynamic stack */
		
		System.out.println("Enter a number whos Factorial is to be found.\n");
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> GenStack = new Stack<Integer>();
		int n = sc.nextInt();
		
		int i=1;
		int j=1;
		
		
		while(i<=n) {
		GenStack.add(i);
		i++;
		}
		
		int Fact = 1;
		
		while(j<=n)
		{
		Fact = Fact*(GenStack.pop());
		j++;
		}
		
		System.out.println("The Factorial of "+n+" is "+Fact);
		System.out.println();
		System.out.println("Enter the string to be reversed.\n");
		
		String S = sc.next();
		char [] charStr = S.toCharArray();
		
		Stack<Character> chStk = new Stack<>();
		
		for(char chr: charStr )
		{
			chStk.add(chr);
		}
		
		for(int k=0;k<charStr.length;k++)
		{
			charStr[k] = chStk.pop();
		}
		
		System.out.println("The String Before Reverse is "+S);
		System.out.println();
		
		String Str = new String(charStr);
		
		System.out.println("The String After Reverse is "+Str);
		sc.close();
	}

}
