package serializationEg;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9063229825343936091L;
	private String name;
	private Integer Id;
	private Address address; // if no need to serialize put transient
	
	
	//private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + Id +"**address**"+address.getCity()+"]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
