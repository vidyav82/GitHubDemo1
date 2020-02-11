package JavaFileS9Assign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Filepath = "C:\\Users\\vasud\\eclipse-workspace\\Jan2020Java\\src\\JavaFileS9Assign\\config.properties";
		try {
			FileInputStream FileIn = new FileInputStream(Filepath);
			FileOutputStream FileOut = new FileOutputStream(Filepath);
			Properties props = new Properties();
			props.load(FileIn);
			props.store(FileOut, null);
			
			System.setProperty("UserName", "vidyavenkatesh@gmail.com");
			System.setProperty("Password","Folsom123@@");
			
			System.getProperties().putAll(props);
			
			System.out.println(System.getProperty("UserName"));
			System.out.println(System.getProperty("Password"));
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
	}

}
