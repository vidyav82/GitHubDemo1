package JavaAssignS8;

public class Student implements Comparable<Student> {

	String sName;
	int rNo;
	
	public Student(String name,int rnum){
		this.sName = name;
		this.rNo = rnum;
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return 0;
		
		//return this.sName - o.sName;
		//return this.rNo - o.rNo;
		
		return this.sName.compareTo(o.sName);
	}
}
