import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TabDelimiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File f  = new File("D:/testTab.csv");
		File f  = new File("D:/muthu1.csv");
		try {
		DataInputStream fis = new DataInputStream(new FileInputStream(f));
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		
			while ((line = br.readLine()) != null) {
				
				System.out.println("LIne : "+line);
				String[] lineArray = line.split("\t");
				for (String lineArrayContent : lineArray) {
					System.out.println("LineArrayContent : "+lineArrayContent);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
