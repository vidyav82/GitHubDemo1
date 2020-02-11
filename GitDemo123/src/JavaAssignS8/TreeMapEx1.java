package JavaAssignS8;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapEx1  {
	
	public static void main(String[] args) {
		
			
		StudentTree std1 = new StudentTree("Advaith",3);
		StudentTree std2 = new StudentTree("Vedanth",2);
		StudentTree std3 = new StudentTree("Aditya",4);
		StudentTree std4 = new StudentTree("Atif",6);
		StudentTree std5 = new StudentTree("Aditi",10);
		
		LibraryTree Lib1 = new LibraryTree(1234,10);
		LibraryTree Lib2 = new LibraryTree(1332,13);
		LibraryTree Lib3 = new LibraryTree(2234,15);
		LibraryTree Lib4 = new LibraryTree(3334,24);
		LibraryTree Lib5 = new LibraryTree(4434,50);
				
		TreeMap<String,Integer> StdTree1 = new TreeMap<>();
		
		StdTree1.put(std1.name,Lib1.LibNum);
		StdTree1.put(std2.name,Lib2.LibNum);
		StdTree1.put(std3.name,Lib3.LibNum);
		StdTree1.put(std4.name,Lib4.LibNum);
		StdTree1.put(std5.name,Lib5.LibNum);
		
		for(Map.Entry<String,Integer> entry1:StdTree1.entrySet())
		{    
			//String key=entry1.getKey();  
			//Integer s=entry.getValue();  
	        System.out.println("Student Name:  "+String.valueOf(entry1));
	        System.out.println();
	        
		}

}
}
