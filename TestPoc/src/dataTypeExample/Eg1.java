package dataTypeExample;

import com.itextpdf.text.log.SysoLogger;

public class Eg1 {

	public static void main(String[] args) {
		Long a = new Long(1);
		long b = 2;
		a = null;
		b = Long.vanull;
		if(a == null){
			System.out.println("if");
			a  = new Long(2);
		}
		System.out.println("a"+a+"**"+b);

	}

}
