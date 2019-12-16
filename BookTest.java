package day9;

class Book {
	String title;
	String author;
	private int price;

	Book() {
		this("자바의 정석","남궁성",30000);
	}

	Book(String p1, String p2, int p3) {
		this.title = p1;
		this.author = p2;
//		this.price = p3;
		setPrice(price);
	}

	void setPrice(int price) {
		if(price < 0) {
			//오류 발생
			this.price = -price;
		}
		else {
		
			this.price = price;
		}
	}
	
	String getBookInfo() {
		return title +" " +author+ " " + price;
	}
	

}

public class BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("자바의 정석", "남궁성", -30000);
//		Book book1 = new Book();
		book.setPrice(-33000) ;
		
		System.out.println(book.getBookInfo());
//		System.out.println(book1.getBookInfo());
		}
}
