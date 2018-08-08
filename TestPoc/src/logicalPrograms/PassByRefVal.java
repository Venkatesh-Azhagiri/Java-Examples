package logicalPrograms;
public class PassByRefVal {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("test1");
		Person p2;
		System.out.println("P1 "+p1.getName());
		p2 = p1;
		p2.setName("test2");
		System.out.println("P2 "+p1.getName());
		

	}

}
class Person{
	private String name;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
