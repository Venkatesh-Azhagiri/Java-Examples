package java8Predicate;

import java.util.ArrayList;
import java.util.List;

public class CompareAppleByProp {
	
	public static boolean isGreenApple(Apple apple){
		return "green".equalsIgnoreCase(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple){
		return apple.getWeight()>100;
	}
	
	static List<Apple> filterApples(List<Apple> apple,
			Predicate<Apple> p)
	{
		List<Apple> filteredApples = new ArrayList<Apple>();
		for(Apple appleFruit:apple){
			if(p.verify(appleFruit)){
				filteredApples.add(appleFruit);
			}			
		}
		return filteredApples;
	}

}
