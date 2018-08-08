package logicalPrograms;
import java.util.Scanner;

public class LogicalFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting fibonnaci series number ");
		int input = sc.nextInt();
		int a[] = new int[input];
		a[0] = 0;
		a[1] = 1;
		for(int i =2; i< a.length; ++i){
			a[i] = fibonaci(a[i-1], a[i-2]);
		}
		for(int j =0; j<a.length;++j){
			System.out.println(" fibonaci "+j+"  values "+a[j]);
		}
		

	}
	public static int fibonaci(int num1, int num2){
		/*if(num1 == 1 || num1 == 0){
			return 1;
		}else{
			
		}*/
		
		
		return  num1+num2;
	}
		/*System.out.println("Enter Number of value : ");
		int start = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		int a = start;
		int b = 1;
		int c = 0;
		
		c = start;
		
		System.out.println("The Fibonacci Series are : ");
		
		for(int i=1; i<=n; i++) {
						
			int temp = a;
			a = b;
			b = c;
			
			System.out.println(c);
			
			c = a + b;
		}
	}*/
}
