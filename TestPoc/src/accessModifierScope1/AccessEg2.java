package accessModifierScope1;

public class AccessEg2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(""+p.message);

	}

}
