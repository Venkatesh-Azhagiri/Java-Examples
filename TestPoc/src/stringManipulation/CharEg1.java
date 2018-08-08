package stringManipulation;

public class CharEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String wellId =  "A07";
		StringBuffer sb = new StringBuffer(wellId);
		
		boolean a = Character.isDigit(wellId.charAt(0));
		System.out.println(a);
		if(Character.isDigit(wellId.charAt(0))){
	         System.out.println("if block");
	         wellId = "Invalid";
	        }else{
	        	   wellId  = ((wellId.length() == 2) ? sb.insert(1, 0).toString().toUpperCase() : wellId.toUpperCase());
	        }
		System.out.println("wellId******"+wellId);
	}

}
