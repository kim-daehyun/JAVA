package day1;
/* 학습내용
 * 1. 데이터타입(숫지,논리,문자,문자열)
  숫자데이터 - 정수(byte(1바이트), short(2), int(4), long(8)), 
  실수데이터 - 실수(float(4), double(8))
  문자데이터 - 문자의 코드값 처리, 2바이트
 '1'-0031, 'a'-0061, '가'-AC00 
  문자열데이터 - 객체로 취급, "ABC", "123", "###"
  */

public class LiteralTest {
	public static void main(String[] args) {
		System.out.println(1+1); //정수
		System.out.println(1.0+1); //실수
		System.out.println("1"+1);//문자열
		System.out.println('1'+1);//문자 1이라는 문자의 값
		System.out.println(77777777777777L);
		}

	/*리터럴 : 프로그램 소스코드에서 사용되는 데이터값
	 * 1, 1.0, '1',"1", "가", "가나다", "java"
	 *true, false 
	 **/
	
}
