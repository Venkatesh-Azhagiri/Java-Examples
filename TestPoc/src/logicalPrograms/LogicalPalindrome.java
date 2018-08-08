package logicalPrograms;
import java.util.Scanner;

public class LogicalPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		char[] c1 = c.toCharArray();
		StringBuffer sb =new StringBuffer();
		for(int i =c1.length-1; i>=0;--i){
			System.out.println("character "+c1[i]);
			sb.append(c1[i]);
		}
		
		if(sb.toString().equals(c)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
