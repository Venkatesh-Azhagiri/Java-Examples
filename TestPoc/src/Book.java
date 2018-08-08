import java.util.ArrayList;
import java.util.List;

class Book {

	String bookName;
	String authorName;

	Book() {
	}

	Book(String bookName, String authorName) {
		this.bookName = bookName;
		this.authorName = authorName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || (obj.getClass() != this.getClass())) {
			return false;
		}

		Book bobj = (Book) obj;
		if (bookName == bobj.bookName
				|| (bookName != null && bookName.equals(bobj.bookName))) {
			if (authorName == bobj.authorName
					|| (authorName != null && authorName
							.equals(bobj.authorName))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = (37 * hash) + (null == bookName ? 0 : bookName.hashCode());
		hash = (37 * hash) + (null == authorName ? 0 : authorName.hashCode());
		return hash;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("bookName=").append(bookName);
		sb.append(",authorName=").append(authorName);
		return sb.toString();
	}
}

