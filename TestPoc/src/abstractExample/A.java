package abstractExample;

abstract  class C {
	public void test(){
		
	}
	/*public void check(){
		System.out.println("test abstract***");
	}*/
	public abstract void check();
}

abstract class B extends C{
	/*public void check(){
		System.out.println("Hai");
	}*/
	
}

class D extends B{
	public void check(){
		System.out.println("Hai1");
	}
}
class A{
	public static void main(String ar[]){
		D d = new D();
		d.check();
		
	}
	
}