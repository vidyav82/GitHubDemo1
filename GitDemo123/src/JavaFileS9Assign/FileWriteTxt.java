package JavaFileS9Assign;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Flepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\JavaFileS9Assign\\File1Txt";
		//String line;
		try {
			
		
		FileWriter fw = new FileWriter(Flepath);
		BufferedWriter Bw = new BufferedWriter(fw);
		
				
		
		Bw.write("Hi Everyone1233");
		Bw.newLine();
		Bw.write("Hows Life12345");
		Bw.newLine();
		Bw.write("Have a good Life.12345");
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
