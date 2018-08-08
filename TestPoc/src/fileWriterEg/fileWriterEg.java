package fileWriterEg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\venkatesh.txt");
		BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter(f));
			br.write("Super Mamma");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
