package comparableMapExample1;

public class Car implements Comparable<Car> {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	private Integer vehicleNumber;
	private String color;
	public Integer getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(Integer vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.vehicleNumber.compareTo(o.getVehicleNumber());
	}
	
	


}
