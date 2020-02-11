package Hackathon;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q16. Write a method that will remove given character from the String?
		
				String S;String c;
				System.out.println("Enter a String.\n");
				
				Scanner sc = new Scanner(System.in);
				
				S = sc.nextLine();
				System.out.println("Enter a char to remove from string.\n");
				
				c = sc.next();
				
				S = S.replaceAll(c," ");
				
				System.out.println(S);
				
				
				sc.close();
			}

		}

	


