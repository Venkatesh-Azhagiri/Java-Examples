package overridingEg;

class A{
	 int i =2;
	 public void sum(){
		 System.out.println("Parent");
	 }
}
class B extends A{
	 int i = 5;
	 public void sum(){
		 System.out.println("child");
	 }
}
public class OverridingEg1 {

	public static void main(String[] args) {
		int i =18;
		byte by = (byte)i;
		int k =20;
		long l = k;
		System.out.println("dfd***"+by+"***"+l);
		// TODO Auto-generated method stub
		//A b = new B();
	    A  b = new B();
		System.out.println("b*****"+b.i+"********");
		b.sum();

	}

}
