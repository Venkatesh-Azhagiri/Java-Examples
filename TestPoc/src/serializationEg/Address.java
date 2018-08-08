package serializationEg;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String city;
	Address(){
		city = "";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
