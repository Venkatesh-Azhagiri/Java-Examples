package comparingStringCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ComparingCharacterEg1 {

	
	public static void main(String[] args) {
		//int counter = 0;
		// Bases G and T are the GREEN Laser
		//Bases A and C are the RED laser
		String w1 = "ATGC";
		String w2 = "ATTC";
		char[] first  = w1.toUpperCase().toCharArray();
		char[] second = w2.toUpperCase().toCharArray();
		Character green  = 'G';
		Character greenCombination = 'T';
		Character red  =  'A';
		Character redCombination = 'C';
		int minLength = Math.min(first.length, second.length);
		//List<Integer> list = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Green", 0);
		map.put("Red", 0);
		
		for(int i = 0; i < minLength; i++)
		{		
			System.out.println("first[i]*****"+first[i]);
			System.out.println("second[i]*****"+second[i]);
		       /* if (first[i] == second[i])
		        {*/
		        	/*if((first[i] == green || first[i] == greenCombination) && (second[i] == green || second[i] == greenCombination)){
		        		Integer greenValue = map.get("Green")+1;
		        		map.put("Green", greenValue);
		        	}*/
		        	
		        	if(((first[i] == green) && (second[i] == greenCombination)) ||  ((first[i] == greenCombination) && (second[i] == green))) {
		        	//if(first[i] == green) {
		        	
		        		System.out.println("check");
		        		Integer greenValue = map.get("Green")+1;
		        		map.put("Green", greenValue);
		        	}
		        	//if((first[i] == red || first[i] == redCombination) && (second[i] == red || second[i] == redCombination)){
		        	if(((first[i] == red) && (second[i] == redCombination)) ||  ((first[i] == redCombination) && (second[i] == red))) {
		        		Integer redValue = map.get("Red")+1;
		        		map.put("Red", redValue);
		        	}
		       // }
		}
		
		//System.out.println("counter******"+counter);
		for(Map.Entry<String, Integer> mp: map.entrySet()){
			System.out.println("Key "+mp.getKey()+"***value***"+mp.getValue());
		}

	}

}
