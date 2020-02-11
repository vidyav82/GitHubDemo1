package JavaAssignS8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implement singly linked list with following operations 
		Insert and delete last 
		Insert and delete front 
		Display 
		FindMin 
		FindMax 
		Delete using position(first node has pos =0) */
		
		LinkedList<Integer> Lnklst = new LinkedList<>();
		
		Lnklst.addLast(12);
		System.out.println("The Last Added Integer is: "+Lnklst.getLast());
		Lnklst.removeLast();
		Lnklst.addFirst(20);
		System.out.println("The First Added Integer is: "+Lnklst.getFirst());
		Lnklst.removeFirst();
		
		Lnklst.add(15);
		Lnklst.add(16);
		Lnklst.add(18);
		Lnklst.add(25);
		Lnklst.add(67);
		
		Iterator<Integer> it1 = Lnklst.iterator();
		while(it1.hasNext()) {
			System.out.println("The Items in Linked list is : \n"+it1.next());
		}
		System.out.println();
		
		Collections.sort(Lnklst);
		
		System.out.println("The Minimum in the list is: "+Lnklst.getFirst());
		System.out.println();
		System.out.println("The Maximum in the list is: "+Lnklst.getLast());
		System.out.println();
		
		Lnklst.remove(2);
		
		System.out.println();
		for(int i=0;i<Lnklst.size();i++)
		{
			System.out.println("The Linked List Elements are: "+Lnklst.get(i));
		}
		
	}

}
