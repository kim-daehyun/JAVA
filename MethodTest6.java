package day6;	

public class MethodTest6 {
	/* 배열 타입의 매개변수를 선언하여 매서드 호출시 배열을 아규먼트로 전달받으면 전달받는
	 * 데이터의 갯수를 제한하지 않게 된다.
	 * 
	 * java 5에서는 가변형 아규먼트 구문이 추가된다.
	 * 리턴타입 메서드명(int... p){p를 배열로 사용한다}
	 * 매서드명(1,2,3), 매서드명(1,2,3,4,5), 매서드명()
	 * new int[0]
	 * */
	public static void main(String[] args) {

	
		System.out.println("main() 수행시작");
		System.out.println(add(10,100));
		System.out.println(add(10,20, 30));
		
		System.out.println(add(new int[] {10,20,30,40}));
		System.out.println(add(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(add());
		System.out.println(add(10,20,30,40,50));
		System.out.println(add(11,22,33,44,55,66,77,88,99));

		System.out.println("main() 수행종료");
		
	}
	static int add(int p1,int p2) {
		return p1+p2;
	}
	static int add(int p1,int p2,int p3) {
		return p1+p2+p3;
	}
	
	static int add(int... p) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			sum+=p[i];
		}
		return sum;
	}
}
