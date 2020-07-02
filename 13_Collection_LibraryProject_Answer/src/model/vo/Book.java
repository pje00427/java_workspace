package model.vo;

public class Book {
	
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	public Book() {
		
	}

	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		String categoryStr = "";
		
		switch(category) {
		case 1:categoryStr = "�ι�"; break;
		case 2:categoryStr = "�ڿ�����"; break;
		case 3:categoryStr = "�Ƿ�"; break;
		case 4:categoryStr = "��Ÿ"; break;
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + categoryStr + ", author=" + author + "]";
	}
	
	
	
}
