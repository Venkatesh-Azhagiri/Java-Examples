package HashMapEqualsExample;

import com.itextpdf.text.log.SysoLogger;

public class Car {
	private String color;
	private Integer vehicleNumber;
	
	
	public Car(){
		color = "";
		vehicleNumber = -1;
	}
	
	public Car(String color, int vehicleNumber){
		this.color = color;
		this.vehicleNumber = vehicleNumber;		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Integer getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(Integer vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((vehicleNumber == null) ? 0 : vehicleNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o){
		System.out.println("test equals 1");
		Car car = (Car)o;
			if(this.vehicleNumber == car.getVehicleNumber()){
				System.out.println("test equals 2");
				return true;
			}
			
		
		return false;
	}
	
	
	

}
