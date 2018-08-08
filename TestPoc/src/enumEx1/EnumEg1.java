package enumEx1;
class TestEnum {
enum  Enum2{BIG, SMALL, MEDIUM};
Enum2 enu;
}


public class EnumEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnum test = new TestEnum();
		test.enu = test.enu.BIG;
		System.out.println("Enum***"+test.enu);
	}

}
