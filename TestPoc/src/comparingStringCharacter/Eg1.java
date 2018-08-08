package comparingStringCharacter;

import java.util.ArrayList;
import java.util.List;

public class Eg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"ATGCTG", "AGTAAG", "1GTATG"};
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length; ++i){
			list.add(s[i]);
		}
		List<char[]> sc = new ArrayList<char[]>();
		//int i=0;
		
		for(String ls:list){
			sc.add(ls.toCharArray());
			//++i;		
		}
		for(char c =0; c<sc.size();++c){
			//iterate with total length
			for(int i = 0; i <6; ++i){
				System.out.println("c****"+sc.get(c)[i]);
			}
		}
		/*for(char[] c: sc){
			System.out.println("character****"+c[0]);
		}*/

	}

}
