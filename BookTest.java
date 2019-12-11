package day7;
class Book {
	String title;
	String author;
	int price;

	Book() {
		title = "자바의 정석";
		author = "남궁성";
		price = 30000;
	}

	Book(String p1){
		title = p1;
		author = "emma";
		price = 200000;
	}
	
	Book(String p1,String p2){
		title = p1;
		author = p2;
		price = 21000;
	}
	
	Book(String p1, String p2, int p3) {
		title = p1;
		author = p2;
		price = p3;
	}

	void getBookInfo() {
		System.out.println(title +" " +author+ " " + price);
	}
	
	void getBookInfo(int price) {
		System.out.println(title +" "  +author + " " +price);
	}

}

public class BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.getBookInfo();
		Book b2 = new Book("자바의 정석");
		b2.getBookInfo();
		Book b3 = new Book("수학의 정석", "하하하");
		b3.getBookInfo();
		Book b4 = new Book("과학의 정석", "아인슈타인");
		b4.getBookInfo(5000000);
		Book b5 = new Book("lol의 정석", "페이커");
		b5.getBookInfo(700000000);
	}
}
