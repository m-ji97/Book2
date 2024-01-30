package com.javaex.ex03;

public class BookVo {

	//필드
	private int bookId;
	private String bookName;
	private String bookDesc;
	
	//생성자
	public BookVo() {
	}

	public BookVo(int bookId, String bookName, String bookDesc) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
	}

	//메소드
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int BookId) {
		this.bookId = BookId;
	}

	public static String getBookName() {
		return bookName;
	}

	public void setBookName(String BookName) {
		this.bookName = BookName;
	}

	public static String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String BookDesc) {
		this.bookDesc = BookDesc;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "BookVo [BookId=" + bookId + ", BookName=" + bookName + ", BookDesc=" + bookDesc + "]";
	}
	
}
