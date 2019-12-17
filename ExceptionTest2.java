

package day11;
public class ExceptionTest2 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);    //예외가 발생할 수도 있는 코드를 try문에 기입
			int num2 = Integer.parseInt(args[1]);	//try에서 예외발생하면 더이상 실행되지 않음
			int result = num1/num2;
			System.out.println("연산 결과 :" +result);
		}								//else if 문 과 비슷함 에러가 발생하든 안하든 무조건 실행
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2개 전달ㄱ");
		}catch (ArithmeticException e) {   //처리하고자 하는 수행의 변수
			e.printStackTrace(); //callstack 정보를 출력하시오 정확히 어느열에서 발생했는지 알 수 있움 
								 //	at day11.ExceptionTest2.main(ExceptionTest2.java:10)
								
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달ㄱ");
			return;    //return 기입해도 finally는 무조건 수행됨
		}catch (Exception e) {    //exception e에러가 다 catch를 하니 뒤에 나오는 catch문은 에러뜸 //조상일 수록 아래에, 자손일 수록 위쪽에 위치시킴
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달ㄱ");
			
		} finally {	
			System.out.println("항상수행!!!!!!!!");
		}
		System.out.println("수행종료");
	
	}

}
