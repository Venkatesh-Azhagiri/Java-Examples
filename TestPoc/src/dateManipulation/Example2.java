package dateManipulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1991-09-02
		//02-09-91
		//String dateString = "02-09-91";
		String dateString = "1991-09-02";
		//SimpleDateFormat simpleFormat = new SimpleDateFormat("dd-MMM-yyyy");
		/*String date = format.format(dateString);
		System.out.println("date****"+date);*/
		
		try {
			/*Date oldDate = simpleFormat.parse(simpleFormat.format(dateString));
			System.out.println("date****"+oldDate);*/
			
			//SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yy");
		    //SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		    SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		    Date date = format1.parse("1991-09-02");
		    System.out.println(format2.format(date));
		    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
