package TestResourceBundle;

import java.util.ResourceBundle;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle resourceBundle = ResourceBundle.getBundle("hello");
		System.out.println(""+resourceBundle.getString("hello"));

	}

}
