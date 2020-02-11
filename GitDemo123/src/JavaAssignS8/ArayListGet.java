package JavaAssignS8;

import java.util.ArrayList;
import java.util.Iterator;



public class ArayListGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to get the position of a particular element in an 
		//Array List? 
		
		ArrayList<Integer> intArayList = new ArrayList<Integer>();
		
		intArayList.add(10);
		intArayList.add(80);
		intArayList.add(50);
		intArayList.add(90);
		
		Iterator<Integer> it1 = intArayList.iterator();
		
		while(it1.hasNext())
		{
			System.out.println("The Elements in the ArrayList is:"+it1.next());
		}
		System.out.println();
		
		for(int i=0;i<intArayList.size();i++)
		{
			System.out.println("The Elements and its index is: "+intArayList.get(i));
		}
		System.out.println();
		
		System.out.println("The index of 80 is:  "+intArayList.indexOf(80));
	}

}
