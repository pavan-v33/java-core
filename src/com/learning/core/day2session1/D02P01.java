package com.learning.core.day2session1;

public class D02P01 {
	class Book {
		private String book_title;
		private int book_price;

		public Book(String book_title, int book_price) {
			this.book_title = book_title;
			this.book_price = book_price;
		}

		public String getBook_title() {
			return book_title;
		}

		public void setBook_title(String book_title) {
			this.book_title = book_title;
		}

		public int getBook_price() {
			return book_price;
		}

		public void setBook_price(int book_price) {
			this.book_price = book_price;
		}
	}

	public Book createBooks(String title, int price) {
		return new Book(title, price);
	}

	public void showBooks(Book book) {
		System.out.println("Book Title: " + book.getBook_title() + " and Price: " + book.getBook_price());
	}

	public static void main(String[] args) {
		D02P01 program = new D02P01();

		Book myBook = program.createBooks("Java Programming", 350);

		program.showBooks(myBook);
	}
}