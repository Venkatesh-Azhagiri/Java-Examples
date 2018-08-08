package exceptionExample;

public class ExceptionEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i=1/0;
		}/*catch(Exception e){
			System.out.println("test***"+e);
		}*/finally{
			System.out.println("hi");
		}

	}

}
