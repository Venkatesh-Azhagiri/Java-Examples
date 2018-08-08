package genericSuperSubTypeEg1;

public class GenericSuperSubTypeEg1 {

	/**
	 * @param args
	 */
	
	public static void checkAnimals(Animal[] animal){
		for(Animal a:animal){
			a.checkup();
		}
		
	}
	public static void main(String[] args) {
		Dog[] dog = {new Dog(), new Dog()};
		Cat[] cat = {new Cat(), new Cat()};
		Bird[] bird = {new Bird(), new Bird()};
		checkAnimals(dog);
		checkAnimals(cat);
		//checkAnimals(bird); // we cannot invoke since Bird doesnt extend Animal will show compilation error
	}

}
