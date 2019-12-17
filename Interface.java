/* [인터페이스]        ----------매우중요-----------
 * -클래스, final클래스, abstract클래스
 * -인터페이스는 모든 메서드가 abstract 매서드인 클래스를 의미
 * -굳이 왜 인터페이스를 사용함?? 자바는 단일상속을 지원하는 OOP언어이다
 * 모든 메서드가 abstract인 클래스를 상속한 경우 다른 클래스는 상속 불가
 * ------> 인터페이스는 추가 상속이 가능한 특별한 형태의 클래스이다. 
 * 인터페이스는 abstract 클래스와 비슷한 자바 프로그램의 구조로서 
 * 객체 생성은 불가하고 상속으로만 사용가능하다 
 *  interface는 상속만 가능, 객체생성 불가 
 * 인터페이스 생성 방법
 * 어떤 클래스를 상속하든지 관계가 없다
 * 
 *  interface 인터페이스이름 {
 *  			상수
 *  			abstract 메서드
 *  }
 *  -인터페이스 사용 방법 : 상속
 *  interface 인터페이스이름 extends 부모인터페이스이름 {
 *  
 *  }
 *  class 클래스명  extends 부모클래스이름 implements 부모인터페이스명 {
 *  
 *  }
 *  자바의 패키지들
 *  
 *  java.~~    - 기본
 *  	java.lang,java.util,java.io,java.net,java.sql.. 
 *  javax.~~~  - 확장
 *  	javax.sql, javax.nio...
 *   ---------> 자바언어에서만 지원하는 API
 *  org.~~~    - 
 *   ---------> 자바에서만 지원하지 않고 다른 프로그래밍 언어에서도 지원되는 API로, 어떤 
 *   			표쥰화 위원회나 조직에서 정한 API를 자바에서도 지원하기 위해 만든 것
 * */

package day11;
public class Interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
