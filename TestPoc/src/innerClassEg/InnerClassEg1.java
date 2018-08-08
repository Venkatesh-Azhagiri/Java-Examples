package innerClassEg;

public class InnerClassEg1 {
   static class Eg1{
	   void go(){
		   System.out.println("Static go method");
	   }
   }
	public static void main(String[] args) {
		Eg1 eg = new Eg1();
		eg.go();

	}

}

