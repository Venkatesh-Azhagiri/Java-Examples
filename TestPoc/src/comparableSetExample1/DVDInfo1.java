package comparableSetExample1;

public class DVDInfo1 implements Comparable<DVDInfo1> {
	private String title;
	private String genre;
	private String composer;
	
	public DVDInfo1(String title, String genre, String composer) {		
		this.title = title;
		this.genre = genre;
		this.composer = composer;
	}

	public DVDInfo1() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	@Override
	public String toString() {
		return "DVDInfo [title=" + title + ", genre=" + genre + ", composer="
				+ composer + "]";
	}

	@Override
	public int compareTo(DVDInfo1 o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.title);
	}

	
	
	

}
