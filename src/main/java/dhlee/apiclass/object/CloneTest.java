package dhlee.apiclass.object;

public class CloneTest{
	public static void main(String[] args) throws CloneNotSupportedException {
		Book2 book = new Book2("토지", "박경리");
		System.out.println(book);  // dhlee.apiclass.object.Book2@15db9742

		Book2 book2 = (Book2) book.clone();
		// Cloneable implements 하기 전
		// System.out.println(book2); // CloneNotSupportedException 발생

		// Cloneable implements 선언
		System.out.println(book2); // dhlee.apiclass.object.Book2@6d06d69c
	}
}

class Book2 implements Cloneable{
	String title;
	String author;

	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}