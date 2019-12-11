package day7;
/*
 * this : 자신의 객체 참조값을 의미하는 리터럴
 * this.xxxx 나의 멤버 xxxx와 같은 의미이다. 
 * this() : 생성자 메서드 내에서만 호출가능
 * 			생성자 메서드의 첫 행에서만 호출가능
 * 			동일한 클래스 내에 있는 다른 생성자를 호출 
 * */
class Book_1 {
	
	String title;
	String author;
	int price;
	 
	
	Book_1() {
		this("자바의 정석","남궁성",30000);
	}

	Book_1(String p1, String p2, int p3) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void getBookInfo() {
		System.out.println(title +" " +author+ " " + price);
	}
	

}

public class BookTest2_this {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_1 b1 = new Book_1();
		b1.getBookInfo();
		/*
		Book_1 b2 = new Book_1("자바의 정석");
		b2.getBookInfo();
		Book_1 b3 = new Book_1("수학의 정석", "하하하");
		b3.getBookInfo();
		Book_1 b4 = new Book_1("과학의 정석", "아인슈타인");
		b4.getBookInfo(5000000);
		Book_1 b5 = new Book_1("lol의 정석", "페이커");
		b5.getBookInfo(700000000);
	*/
	}
}
