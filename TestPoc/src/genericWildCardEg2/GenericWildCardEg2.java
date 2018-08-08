package genericWildCardEg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.record.formula.functions.T;

public class GenericWildCardEg2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<? super Animal> lst = new ArrayList<Animal>();
		
		
		
		List<Animal> animalList  = new ArrayList<Animal>();
	
		animalList.add(new Dog());
		animalList = gPrintA(animalList);
		System.out.println("Generic Type Example ");
		for(Object o: animalList){
			System.out.println("Generic Type****"+ o);
		}
		lst.add(new Dog());
		lst = test(lst);
		
		for(Object o:lst){
			System.out.println("wildcard ***"+o);
		}
		/*List<Bird> birdList = new ArrayList<Bird>();
		birdList.add(new Bird());
		gPrintA(birdList);*/
	}
	public static List<? super Animal> test(List<? super Animal> l){		
		l.add(new Dog());
		return l;		
	}
	static <T extends Animal> List<T> gPrintA(List<T> l) {
		l.add((T) new Dog());		
		return  l;
	}
	
	
}
