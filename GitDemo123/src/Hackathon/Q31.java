package Hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read a file content and write it to a new file in reverse order.
		//(reverse line 1-10 to line 10-1)

		String Flepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\Hackathon\\HackTest.txt";
		String line;
		ArrayList<String> ArayFleLine = new ArrayList<String>();
		
		try {
			
		FileReader fr = new FileReader(Flepath);
		BufferedReader Br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(Flepath,true);
		BufferedWriter Bw = new BufferedWriter(fw);
		
		while((line = Br.readLine())!= null)
		{
			//System.out.println("The File has read permisison.");
			ArayFleLine.add(line);
			System.out.println(line);
			System.out.println();
		}
		
		for(int i=(ArayFleLine.size()-1);i>=0;i--) 
		{
			String S = ArayFleLine.get(i);
			Bw.newLine();
			Bw.write(S);
			Bw.newLine();
		}
		
		Br.close();
		Bw.close();
		}
		catch(FileNotFoundException e) 
			{
			e.printStackTrace();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		
		
	}

}
