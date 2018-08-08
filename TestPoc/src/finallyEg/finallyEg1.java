package finallyEg;

import java.io.IOException;

public class finallyEg1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		try{
			int i = 5/0;
			//String s = System.
		}
		catch(IOException e){
			System.out.println("test");
		}catch(Exception e){
			System.out.println("test");
		}finally{
			System.exit(0);
			System.out.println("finally");
		}

	}

}
