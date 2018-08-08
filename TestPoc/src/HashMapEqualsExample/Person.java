package HashMapEqualsExample;

public class Person {
	private String name;
	private Integer age;
	
	public Person(){
		name = "";
		age = -1;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString(){
		return "Person name "+name+" age is "+age;
	}

}
