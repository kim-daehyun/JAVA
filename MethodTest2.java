package day6;	

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		for(int daehyun=1; daehyun<=100; daehyun++) {
			printMyName(10);
			System.out.println("main() 수행종료");
		}
	}
	static void printMyName(int num) {
		for(int i=1;i<=num;i++) {
			System.out.print("민정아 필리핀 잘가 ");
		}
	}
}
