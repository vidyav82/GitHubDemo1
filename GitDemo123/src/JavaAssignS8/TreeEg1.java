package JavaAssignS8;
import java.util.Map;
import java.util.TreeMap;

public class TreeEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
				
		TreeMap<StudentTree,LibraryTree> StdTree1 = new TreeMap<>();
		
		StdTree1.put(std1,Lib1);
		StdTree1.put(std2,Lib2);
		StdTree1.put(std3,Lib3);
		StdTree1.put(std4,Lib4);
		StdTree1.put(std5,Lib5);
		
		for(Map.Entry<StudentTree,LibraryTree> entry:StdTree1.entrySet())
		{    
			StudentTree key=entry.getKey();  
			LibraryTree s=entry.getValue();  
	        System.out.println(s.books+" Books");  
	        System.out.println("Student Name"+key.name);   
		}

	}

}
