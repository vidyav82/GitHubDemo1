package JavaFileS9Assign;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Flepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\JavaFileS9Assign\\File1Txt";
		//String line;
		try {
			
		
		FileWriter fw = new FileWriter(Flepath,true);
		BufferedWriter Bw = new BufferedWriter(fw);
		
				
		
		Bw.append('$');
		Bw.write("Hi and Hello Everyone.");
		Bw.newLine();
		Bw.append('#');
		Bw.newLine();
		Bw.newLine();
		Bw.close();
		
		
		
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
