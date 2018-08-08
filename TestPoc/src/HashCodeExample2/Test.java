package HashCodeExample2;

public class Test {
	private int i;
	
	Test(int j){
		this.i = j;
	}
	public int getI(){
		return i;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Test){
			Test t = (Test)obj;
			if(t.i == this.i){
				return true;
			}
			
		}
		return false;
	}
	
	public int hashCode(){
		if(this.i == 2)
			return 3 * this.i;
		else 
			return 2* this.i;
	}

}
