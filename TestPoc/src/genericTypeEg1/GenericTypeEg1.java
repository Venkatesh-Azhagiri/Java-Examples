package genericTypeEg1;

public class GenericTypeEg1<T extends Animal> {
	T animal;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericTypeEg1<Dog> gen = new GenericTypeEg1<Dog>();
		gen.animal.checkup();

	}

}
