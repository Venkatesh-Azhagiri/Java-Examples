package accessModifierScope1;

public class Parent {
	String message = "Parent";
	public void print(){
		message = "hai";
		System.out.println(""+message);
	}

}
