package interfaceEg;

class c implements A{
	static int i=5;
	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("Interface method");
		
	}
	
	public void A(int a, int b){
		i=6;
		System.out.println("Overloaded method");
	}
	
	public void B(){
		System.out.println("i(***"+i);
	}
	
}
public class B {
	
	public static void main(String are[]){
		
		A a = new c();
		a.A();
		//a.A(5,10); // will throw an error
		c d = new c();		
		d.A(5, 10);
		d.B();
		
	}

}
