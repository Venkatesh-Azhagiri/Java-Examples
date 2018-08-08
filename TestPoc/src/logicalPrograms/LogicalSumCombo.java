package logicalPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class LogicalSumCombo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		int[] a ={1,8,1,6,9,4,3};
		ArrayList<String> ls = new ArrayList<String>();
		for(int i=0; i<a.length;++i){
			if(i>1){
				
			}
			for(int j=1; j<a.length;++j){
				if(i!=j)
				System.out.println(" i " +i +" values "+a[i] + " j " +a[j]);
				if((a[i]+a[j])==input){
					ls.add("{"+a[i]+","+a[j]+"}");					
				}
			}
		}
		System.out.println("Arraylist "+ls);
		/*int num = 1234;
		System.out.println("Reverse a number  "+reverseNum(num));*/
		
		
		
		
		
		

	}
	
	public static int reverseNum(int num)
	{
	    int reverse = 0;
	    while(num != 0)
	    {
	        reverse = reverse*10 + num%10;
	        num = num/10;
	    }
	    return reverse;
	}
	

}
