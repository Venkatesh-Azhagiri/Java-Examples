package abstractExample;

public class testAbstract  extends testAbstract2 implements testInterface{

	public static void main(String[] args) {
		testAbstract t = new testAbstract();
		
		t.sum();
	}

}


interface testInterface{
	static int i = 0;
	public void sum();
}

abstract class testAbstract1{
	static int  i = 8;
	//comment this method and see
	/*public void sum(){
		System.out.println("Abstract method*****"+i);
		
	}*/
	abstract void sum();
}
abstract class testAbstract2 extends testAbstract1{
	static int  i = 10;
	//comment this method and see
	public void sum(){
	   
		System.out.println("Abstract method testAbstract2*****"+i);
		
	}
}