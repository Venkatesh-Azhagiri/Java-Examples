package dateManipulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exampl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateString = "02-09-91";
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd-MMM-yyyy");
		/*String date = format.format(dateString);
		System.out.println("date****"+date);*/
		
		try {
			/*Date oldDate = simpleFormat.parse(simpleFormat.format(dateString));
			System.out.println("date****"+oldDate);*/
			
			SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yy");
		    SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		    Date date = format1.parse("02-09-91");
		    System.out.println(format2.format(date));
		    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
