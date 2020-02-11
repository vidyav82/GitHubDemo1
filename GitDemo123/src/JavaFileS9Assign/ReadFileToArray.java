package JavaFileS9Assign;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Flepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\JavaFileS9Assign\\File1Txt";
		String line;
		ArrayList<String> ArayFleLine = new ArrayList<String>();
		
		try {
			
		FileReader fr = new FileReader(Flepath);
		BufferedReader Br = new BufferedReader(fr);
		
		
		while((line = Br.readLine())!= null)
		{
			System.out.println("The File has read permisison.");
			ArayFleLine.add(line);
			System.out.println(line);
			System.out.println();
		}
		
		for(String araylne:ArayFleLine) {
			System.out.println();
			System.out.println("The ArrayLines are: "+araylne);
			System.out.println();
		}
		Br.close();
		} catch(FileNotFoundException e) 
			{
			e.printStackTrace();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}

}
