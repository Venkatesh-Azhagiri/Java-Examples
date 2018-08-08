package serializationEg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 Employee emp = new Employee();
		 Address address = new Address();
		 emp.setName("ve");
		 address.setCity("chennai");
		 emp.setId(1);
		 emp.setAddress(address);
		 try {
			FileOutputStream fin = new FileOutputStream("d:\\v.txt");
			ObjectOutputStream ob = new ObjectOutputStream(fin);
			ob.writeObject(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
