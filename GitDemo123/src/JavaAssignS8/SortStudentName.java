package JavaAssignS8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//Create student class with name(String type) and RegNo (int type) attributes. use any collection to Store 5 student information. Sort using student name 

public class SortStudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Student> StudentDet = new LinkedList<>();
		
		StudentDet.add(new Student("Advaith",23));
		StudentDet.add(new Student("Aditya",2));
		StudentDet.add(new Student("Atif",7));
		StudentDet.add(new Student("Vedanth",17));
		StudentDet.add(new Student("Priya",15));
		
		
		
		Iterator<Student> It1 = StudentDet.iterator();
		
		while(It1.hasNext())
		{
			Student temp1 = It1.next();
			System.out.println("The Student RollNum is: "+temp1.rNo+"  Name is  "+temp1.sName);
			System.out.println();
		}
		
		System.out.println();
		
		Collections.sort(StudentDet);
		
		Iterator<Student> It2 = StudentDet.iterator();
		
		while(It2.hasNext())
		{
			Student temp2 = It2.next();
			System.out.println("The Student RollNum is:  "+temp2.rNo+"  Name is   "+temp2.sName);
			System.out.println();
		}
		
		
	}

}
