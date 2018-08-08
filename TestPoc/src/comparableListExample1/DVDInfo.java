package comparableListExample1;

public class DVDInfo implements Comparable<DVDInfo>{
	private String title;
	private String genre;
	private String composer;
	
	public DVDInfo(String title, String genre, String composer) {		
		this.title = title;
		this.genre = genre;
		this.composer = composer;
	}

	public DVDInfo() {
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
	public int compareTo(DVDInfo o) {
		System.out.println("title****"+title);
		System.out.println("argument title****"+o.title);
		return title.compareTo(o.title); // for title sort
		//return genre.compareTo(o.genre);
		
	}
	
	

}
