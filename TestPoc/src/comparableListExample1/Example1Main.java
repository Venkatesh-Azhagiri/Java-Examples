package comparableListExample1;

import java.util.ArrayList;
import java.util.Collections;

public class Example1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DVDInfo  dvdInfo = new DVDInfo();
		ArrayList<DVDInfo> arrayList = new ArrayList<DVDInfo>();
		dvdInfo.setTitle("vTV");
		dvdInfo.setGenre("Blue");
		dvdInfo.setComposer("Rahman");
		
		arrayList.add(dvdInfo);
		dvdInfo = new DVDInfo();
		dvdInfo.setTitle("kumki");
		dvdInfo.setGenre("folk");
		dvdInfo.setComposer("Imman");
		arrayList.add(dvdInfo);
		Collections.sort(arrayList); // for ascending
		//Collections.sort(arrayList, Collections.reverseOrder()); // for descending
		System.out.println("List***"+arrayList);
	}
}
