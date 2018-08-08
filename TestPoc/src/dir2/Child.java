package dir2;

import java.util.Set;

import dir1.Parent;

 class Childs extends Parent {
	void test(){
		set.add("HaI");	
		/*for(String s: set){
			System.out.println("test****"+s);
		}*/
	}
	void test1(){
		for(String s: set){
			System.out.println("test1****"+s);
		}
	}
	

}
public class Child{
		public static void main (String ar[]){
			Childs c = new Childs();
			c.test();
			c.test1();
		}
	}