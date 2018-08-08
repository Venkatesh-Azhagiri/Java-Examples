package EqualsAndHashCode;


import java.util.ArrayList;
import java.util.List;

public class HashCodeMain {	

		public static void main(String a[]) {
			Book b1 = new Book("C Programming", "Dennis Ritchie");
			Book b2 = new Book("C++", "Stroustroup");
			Book b3 = new Book("Java", "James Gosling");
			Book b4 = new Book("JavaScript", "Douglas Crockford");
			Book b5 = new Book("OOAD", "Grady Booch");

			boolean b1eqb1 = b1.equals(b1);
			boolean b1eqb2 = b1.equals(b2);
			boolean b2eqnewobj = b2.equals(new Book("C++", "Stroustroup"));
			boolean b1eqnull = b1.equals(null);

			System.out.println("Object b1 equals b1 :: " + b1eqb1);
			System.out.println("Object b1 equals Object b2 :: " + b1eqb2);
			System.out
					.println("Object b2 equals new Book(\"C++\", \"Stroustroup\") :: "
							+ b2eqnewobj);
			System.out.println("Object b1 equals null :: " + b1eqnull);

			List<Book> list = new ArrayList<Book>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			System.out.println("List of books : " + list);
			System.out.println("List of books : " + list.size());
			System.out.println("Hashcode of object b1 : " + b1.hashCode());
			System.out.println("System Hashcode of object b1 : "
					+ System.identityHashCode(b1));
			// check whether this book is available in the list.
			boolean b = list.contains(new Book("Java", "James Gosling"));
			System.out.println("Book new Book(\"Java\", \"James Gosling\") : " + b);
			System.out
					.println("Index of Book(\"Java Programming\", \"James Gosling\") : "
							+ list.indexOf(new Book("Java Programming",
									"James Gosling")));
			System.out.println("Index of object b3 : " + list.indexOf(b3));
		}
	}


