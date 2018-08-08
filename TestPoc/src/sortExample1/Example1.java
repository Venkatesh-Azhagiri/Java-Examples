package sortExample1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example1{

     public static void main(String []args){
       Set<Integer> set = new HashSet<Integer>();
       set.add(100);
       set.add(10);
       set.add(1000);
       Set<Integer> treeset = new TreeSet<Integer>();
       treeset.addAll(set);
      
    
      
       System.out.println("Values****"+treeset);
     }
}

