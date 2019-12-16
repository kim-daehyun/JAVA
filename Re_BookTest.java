package weekend1;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "자바의 정석";
		author = "남궁성";
		price = 30000;
	}
	
	Book(String p1,String p2,int p3){
		this.title=p1;
		this.author=p2;
		this.price=p3;
	}
	
	String getBookInfo() {
		
		return title + " "+ author + " " + price;
	}
}

public class Re_BookTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book Bk1 = new Book();
		
		
		System.out.println(Bk1.getBookInfo());
		
		
	}

}
