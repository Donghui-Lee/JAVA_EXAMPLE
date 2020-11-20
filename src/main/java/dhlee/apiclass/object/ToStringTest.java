package dhlee.apiclass.object;

public class ToStringTest {
	public static void main(String[] args) {
		Book book = new Book("토지", "박경리");
		Book book2 = new Book("토지", "박경리");
		System.out.println(book);
		System.out.println(book.toString());

		System.out.println(book2);
		System.out.println(book2.toString());


		String str = new String("토지");
		System.out.println(str);
		System.out.println(str.toString());
	}
}

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}
}

