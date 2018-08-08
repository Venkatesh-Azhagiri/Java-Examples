package genericSuperSubTypeEg2;

import genericSuperSubTypeEg2.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericSuperSubTypeEg2 {
	
	// for wildcard example to work  uncomment line 1 and 4 and comment the line3 and 2
	
	/** Line 3****/
	public static void checkAnimals(List<Animal> animal){
		for(Animal a:animal){			
			a.checkup();
		}		
	}
	/***End Line 3**/
	 
	
	/*** Line 4***/
	
/*	public static void checkAnimals(List<? extends  Animal> animal){
		for(Animal a:animal){			
			a.checkup();
		}		
	}*/
	
	/*** End Line 4***/
	
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat());
		/***Line1  Will not compile since in List generics we cannot refer subtype to the super type**/
		//checkAnimals(dogList); 
		//checkAnimals(catList);
		/***End line 1****/
		
		/*** Line 2****/
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog());
		checkAnimals(animalList);
		/**** End Line 2***/
	}

}
