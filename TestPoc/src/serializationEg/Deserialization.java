package serializationEg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("d:\\v.txt");
		ObjectInputStream obin = new ObjectInputStream(fin);
		Employee employee = (Employee)obin.readObject();
		System.out.println("employee****"+employee);
		Address add = (Address)employee.getAddress();
		System.out.println("add****"+add.getCity());
	}

}
