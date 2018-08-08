package dateManipulation;
import java.util.Calendar;  
import java.util.Date;  
import java.text.Format;  
import java.text.SimpleDateFormat;  
public class AddYear {  
  public static void main(String[] args) {  
    Calendar date = Calendar.getInstance();  
    date.setTime(new Date());  
    Format f = new SimpleDateFormat("dd-MMMM-yyyy");  
    System.out.println(f.format(date.getTime()));  
    date.add(Calendar.YEAR,38);  
    System.out.println(f.format(date.getTime()));  
  }  
}