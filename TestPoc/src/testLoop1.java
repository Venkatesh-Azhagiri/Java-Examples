
public class testLoop1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =0;
		for(int i =0; i <2; ++i){
			++k;
			System.out.println("i loop***"+i);
			for(int j =1; j <=2; ++j){
				if(j==2){
					System.out.println("tester***"+i+"***j***"+j);
					
				}else if( i<k){
					break;
				}else if(k == i){
					System.out.println("laste");
				}
				
			}			
		}
	}

}
