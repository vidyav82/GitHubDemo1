package Jan152020;

public class AverageOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to find the average score of two students in three papers. 
		//NOTE: Given, score of first student is 60, 55 and 70 while score of the second 
		//student is 80, 60 and 41. i.e. int[][] score = { {60, 55, 70}, {80, 60, 41} };  
		
		
		int StuScore[][] = {{60,55,70},{80,60,41}};
		int Average[][] = {{0,0,0},{0,0,0}};
		int Row = StuScore.length;
		
		int Col = StuScore[0].length;
		
				
			
		for(int i=0;i<Row-1;i++)
			{
			for(int j=0;j<Col;j++)
			{	
				Average[0][j] = (StuScore[i][j]+StuScore[i+1][j])/2;
			}
			}
		
			
			for(int j=0;j<Col;j++)
			{
				System.out.println("The Average of marks is: "+Average[0][j]);
			}
			
		
		
		
	}

}
