package day8;

class Card{	
	String kind ;			        // 카드의 무늬 - 인스턴스 변수
	int number;			            // 카드의 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭   - 클래스 변수
	static int height = 250;		// 카드의 높이 - 클래스 변수
}

//non-static형 변수는 클래스이름으로 접근할 수 없다.
//static형은 객체 이름보다는 클래스이름으로 접근하는 것이 좋다. 
//jvm은 80%가 자바로 되어있다. 내부적으로 사용되는 것들  자바는 동적로딩이다. 필요할때마다 로딩한다. 이 방법이 훨씬 효율적으로 메모리를 활용하는 것이다.
//verbose : class :JVM옵션
//클래스 로딩정보를 보여주면서 자바 프로그램을 수행시켜라!!!
//블록 스코프
/*
 * 매서드 해더{
 * int a;
 * int b; 여기서 변수를 사용하면 아래 if문에서 에러가 생긴다. 
 * if(...){
 * 		int b;   //여기서 b변수 선언은 블록 내에서만 사용가능
 * }
 * int c;
 * }
 */


public class CardTest{
	public static void main(String args[]) throws Exception{	
		System.out.println("CardTest 수행이 시작었습니다.");
		Thread.sleep(10000);//10초 대기
		Card c1 = new Card();		//c1은 멤버변수
		c1.kind = "Heart";
		c1.number = 7;	
		System.out.println("첫 번째 Card 객체가 생성됨");
		Thread.sleep(10000);//10초 대기
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("두 번째 Card 객체가 생성됨");
		Thread.sleep(5000);//5초 대기
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");	
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
}




