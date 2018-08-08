package varArgEg1;

import com.itextpdf.text.log.SysoLogger;

public class VarArgEx1 {
 static int i;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1(1,2,3,4);

	}
	static void method1(int a, int...b){
		System.out.println("i value*****"+i); // for testing class level variable getting default value
		int[] c= b;
		for(int i:c){
			System.out.println("Value****"+i);
		}
		System.out.println("a*****"+a+"****b******"+b);
	}

}
