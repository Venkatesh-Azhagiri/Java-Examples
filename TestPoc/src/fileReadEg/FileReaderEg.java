package fileReadEg;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "";
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("d:\\venkatesh.txt"));
			while((text = br.readLine())!= null){
				System.out.println("venkatesh ******"+text);
			}
		}catch(Exception e){
			
		}
		
		

	}

}
