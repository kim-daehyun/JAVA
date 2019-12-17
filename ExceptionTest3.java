package day11;
import java.util.Random;
class TestException extends Exception {
	TestException(String message){
		super(message);
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){	
			System.out.println("오류 발생 : "+e.getMessage());   //getMessage 중요함
		}
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {    //throw안넣으면 c();에서 에러남
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {   //throws 무조건 
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean();    //한번만 사용가능함
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}








