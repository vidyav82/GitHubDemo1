package JavaFileS9Assign;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;


public class CheckFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Flepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\JavaFileS9Assign\\File1Txt";
		String line;
		try {
			
		FileReader fr = new FileReader(Flepath);
		//FileWriter fw = new FileWriter(Flepath);
		File file12 = new File(Flepath);
		BufferedReader Br = new BufferedReader(fr);
		//BufferedWriter Bw = new BufferedWriter(fw);
		
		while((line = Br.readLine())!= null)
		{
			System.out.println("The File has read permisison.");
			System.out.println(line);
		}
		
		if(file12.canRead()) {
			System.out.println("We can read the file in the Directory. \n");
		}
		else
		{
			System.out.println("The File cannot be read.\n");
		}
		
		if(file12.canWrite()) {
			System.out.println("We can write the file in the Directory. \n");
		}
		else
		{
			System.out.println("The File does not have write permission.\n");
		}
		
		Br.close();
		
		
		
		
//		Bw.write("Hi Everyone1233");
//		Bw.newLine();
//		Bw.write("Hows Life12345");
//		Bw.newLine();
//		Bw.write("Have a good Life.12345");
//		Bw.newLine();
//		Bw.close();
		
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
