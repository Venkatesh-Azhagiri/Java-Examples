package EqualsAndHashCodeExample;

public class Tiger {
	private String color;
	private String stripePattern;
	private int height;
	public Tiger(String color, String stripePattern, int height){
		this.color = color;
		System.out.println("this****"+this.color);
		this.stripePattern = stripePattern;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("test ");
		if (this == obj)
			return true;			
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		System.out.println("color*****"+color+"*******"+other.color);
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		
		return true;
	}
	
	

}
