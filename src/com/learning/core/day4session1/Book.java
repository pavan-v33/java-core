package com.learning.core.day4session1;

import java.util.Objects;

class Book implements Comparable<Book> {
	private int bookId;
	private String title;
	private double price;
	String author;
	private String dateOfPublication;

	public Book(int bookId, String title, double price, String author, String dateOfPublication) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
	}

	@Override
	public String toString() {
		return bookId + " " + title + "\n" + price + " " + author + "\n" + dateOfPublication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		return bookId == book.bookId;
	}

	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.bookId, o.bookId);
	}
}