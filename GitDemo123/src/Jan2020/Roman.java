package Jan2020;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Roman Number to be converted to Interger\n");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
				
		
		int len = str.length();

	        str = str + " ";
	        int result = 0;
	        
	        for (int i = 0; i < len; i++) 
	        {
	            char ch   = str.charAt(i);
	            char next_char = str.charAt(i+1);
	            
	            if (ch == 'M') 
	            {
	                result += 1000;
	            } else if (ch == 'C') 
	            	{
	                if (next_char == 'M') 
	                {
	                    result += 900;
	                    i++;
	                } else if (next_char == 'D') 
	                {
	                	result += 400;
	                    i++;
	                } else 
	                {
	                    result += 100;
	                }
	            } else if (ch == 'D') 
	            {
	                result += 500;
	            } else if (ch == 'X') 
	            {
	                if (next_char == 'C') 
	                {
	                    result += 90;
	                    i++;
	                } else if (next_char == 'L') 
	                {
	                    result += 40;
	                    i++;
	                } else 
	                {
	                    result += 10;
	                }
	            } else if (ch == 'L') 
	            {
	                result += 50;
	            } else if (ch == 'I') 
	            {
	                if (next_char == 'X') 
	                {
	                    result += 9;
	                    i++;
	                } else if (next_char == 'V') 
	                {
	                    result += 4;
	                    i++;
	                } else {
	                    result++;
	                }
	            } else { // if (ch == 'V')
	                result += 5;
	            }
	        }
	        
	        System.out.println("\nRoman Number: "+str);
	 	   System.out.println("Equivalent Integer: "+result+"\n");
	 	   
	 	   System.out.println("Enter the Inter Number to converto to Roman");
	 	   int n = sc.nextInt();
	 	   
	 	  String roman="";
	        int repeat;
	 
	        repeat=n/1000;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"M";
	        }
	        n=n%1000;
	 
	        repeat=n/900;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"CM";
	        }
	        n=n%900;
	 
	        repeat=n/500;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"D";
	        }
	        n=n%500;
	 
	        repeat=n/400;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"CD";
	        }
	        n=n%400;
	 
	        repeat=n/100;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"C";
	        }
	        n=n%100;
	 
	        repeat=n/90;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"XC";
	        }
	        n=n%90;
	 
	        repeat=n/50;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"L";
	        }
	        n=n%50;
	 
	        repeat=n/40;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"XL";
	        }
	        n=n%40;
	 
	        repeat=n/10;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"X";
	        }
	        n=n%10;
	 
	        repeat=n/9;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"IX";
	        }
	        n=n%9;
	 
	        repeat=n/5;
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"V";
	        }
	        n=n%5;
	 
	        repeat=n/4; 
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"IV";
	        }
	        n=n%4;
	 
	        repeat=n/1; // or simply repeat=n or i<=n in the condition part of the loop
	        for(int i=1; i<=repeat;i++){
	            roman=roman+"I";
	        }
	        
	       System.out.println("The Roman of the Interger is:  "+roman);   
	       sc.close();

	}

}
