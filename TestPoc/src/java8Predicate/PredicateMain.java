package java8Predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateMain {

	public static void main(String[] args) {
	Apple apple1 = new Apple();
	Apple apple2 = new Apple();
	Apple apple3 = new Apple();
	apple1.setColor("blue");
	apple1.setWeight(150);
	apple2.setColor("green");
	apple2.setWeight(100);
	apple3.setColor("red");
	apple3.setWeight(120);
	
	List<Apple> apples = new ArrayList<Apple>();
	apples.add(apple1);
	apples.add(apple2);
	apples.add(apple3);
	
	CompareAppleByProp compareApple = new CompareAppleByProp();
	List<Apple> appleByColor= compareApple.filterApples(apples, CompareAppleByProp::isGreenApple);
	for(Apple appleColor: appleByColor){
		System.out.println("Apple Color******"+appleColor.getColor());
		System.out.println("Apple weight******"+appleColor.getWeight());
	}
	

	}

}
