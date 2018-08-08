package exceptionExample;

public class Exception2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int i = 5/0;
			System.exit(0);
			//return;
		}catch(Exception e){
			System.out.println("catch");
		}finally{
			System.exit(0);
			//return;
			System.out.println("finally");
		}

	}

}
