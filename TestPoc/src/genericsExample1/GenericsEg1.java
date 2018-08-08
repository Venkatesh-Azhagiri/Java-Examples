package genericsExample1;


public class GenericsEg1 {
	 
	 public static void main(String[] args) {
		 
		   Integer[] intArray = {1, 4, 6, 8};
		   Double[] doubleArray = {3.4, 6.5, 8.7};
		   String[] stringArray = {"a", "b", "c", "d"};
		   Float[] floatArray = {1.3f, 2.3f, 0.1f};
		   System.out.println("Integer Array");
		   printArray(intArray);
		   System.out.println("Double Array");
		   printArray(doubleArray);
		   System.out.println("String Array");
		   printArray(stringArray);
		   System.out.println("Float Array");
		   printArray(floatArray);
	 
	} 
   public static<E> void printArray(E[] inputArray){
	  for(E element : inputArray){
		  System.out.print(element + " ");
	  }
	  System.out.println();
	  
   }
	   
}