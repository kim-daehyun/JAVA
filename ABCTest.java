/* 자바의 모든 객체들은 상속이라는 객체지향언어의 틀징을 지원한다. 
 * 재사용성 측면에서 매우 중요하다. 
 * 자바에서 생성되는 모든 객체들은 기본적으로 java.lang.Object이라는 객체를 상속하게 된다. 
 * 모든 class는 Object의 자손이 된다. 
 * 실무에서는 객체가 필수적으로 필요로 할 때만 class를 만든다.  
 * 클래스를 설계하는 사람은 자바의 api를 많이 알고 있어야한다. 
 * 클래스 헤더에 extends라는 절을 사용하는 부모 클래스를 설정하는데, 하나의 부모 클래스만 설정 가능하다. 
 * 조상으로부터 물려받은 메서드들은 필요에 따라 대체할 수 있다. - 메서드 오버라이딩이라고 한다. 
 * 어떤 클래스든 객체를 생성하면 해당 클래스만 메모리 할당하는 것이 아니라 조상 클래스들도 메모리 할당한다. 
 * 자바는 운영체제와 무관하다. 바이트코드 실행파일을 jvm이 실행시키는 것
 * 자손 클래스의 객체 생성시 생성자 메서드가 호출되면 바로 조상클래스의 생성자도 호출된다. 
 * 내부적으로는 아규먼트 없는 생성자가 호출되는데 다른 생성자를 호출하려는 경우 super()라는 메서드를 사용한다. 
 * 객체를 참조하는 용도 : this, super 
 * 객체를 초기화 하는 용도로 사용되는 생성자 메서드 호출: this(), super()
 * this(), super() : 생성자 안에서만 호출 가능 (첫번째 줄에서만!!!!!!!!!!!!!!!)
 * this, super : 객체 생성 시점에 초기화 된다. static 메서드에서는 사용 불가하다.
 * non-static 메서드와 생성자 메서드에서만 사용 가능하다.
 * -------------------------------------------------------------------------
 * [제어자:modifier(수정자,한정자,제어자)]
 * 
 * 접근 제어자 : public, protected, (default), private
 * 활용 제어자 : final, static, abstract, transient, synchonized, ........
 * 제어자란 클래스, 메서드, 변수앞에 설정되어 절근가능 여부와 사용방식을 제어하는 구문
 * 		
 *[제어자] class 클래스명 extends 부모클래스명 {
 * 			
 * 		[제어자] 멤버변수 선언
 * 		
 * 		[제어자] 생성자 메서드 정의 
 * 
 * 		[제어자] 메서드 정의
 *  }
 * 
 * * public, final, abstract class 클래스명 extends 부모클래스명 {
 * 			
 * 		모든접근제어자,final, static 멤버변수 선언
 * 		
 * 		모든접근제어자 생성자 메서드 정의 
 * 
 * 		모든접근제어자, static, final, abstract 메서드 정의
 *  }
 *  -클래스에는 접근제어자를 두 가지만 설정 가능 : public, (default)
 *  public 설정된 클래스 : 누구나 
 *  (default) 클래스 : 동일 패키지내의 클래스
 *  final - 변경할 수 없는, 마지막의 ~~~
 *  abstract - 반드시 변경해야 하는, 마지막이 아닌, 미완성의~~~
 *  final과 abstract은 절대 같이 오지못한다 
 *  final 클래스 : 상속 불가, 객체 생성가능 
 *  abstract 클래스 : 상속 가능, 객체 생성 불가
 *  
 *  ----- public ----
 *  (default) -- 동일 패키지
 *   private -- 자손이든 객체 생성한 클래스든 접근 불가(해당 클래스 안에서만 사용가능)
 *              멤버가 정의된 클래스 내에서만 사용 가능(자손도 접근 불가)
 *  
 *  protected -- 동일패키지 이거나 자손이면 접근 가능 
 *  
 *  + : public
 *  # : protected
 *  () , ~ :(default)
 *  - : private
 *  
 *  static, final을 함께 지정하여 상수를 만든다. 
 *  public class Math{
 *  	public final static double PI = 3.14159;
 *  }
 *  
 *  Math.PI 
 *  
 *  Integer.MAX_VALUE
 *  - 메서드에 
 *  final : 자손에 의해 오버라이딩이 불가능한 메서드를 정의 
 *  abstract : 자손에 의해 반드시 오버라이딩 해야하는 매서드를 정의 (미완성일때)
 *  		     메서드의 헤더만 정의되고 바디가 없는 메서드	
 *  
 *  
 *  자손은 조상의 모든 멤버를 상속받는다.(조상의 private멤버, 생성자, 초기화블럭 제외)
 * 조상에 없는 변수 등을 더한다라고 상속을 이해해라
 * 부모는 자손을 모른다. 자손만이 부모를 알고있다. 
 * 클래스와 클래스와의 관계는 상속과 포함이 있다.
 *                    (is) (has)  
 * final은 overriding을 막는다
 * 
 * */
package day9;

class A{
	A(){
		super();  //첫문장에 this를 호출하면 super를 안한다. 
		System.out.println("A클래스의 객체를 생성합니다.");
	}
}
class B extends A{
	B(int num){
		super();
		System.out.println("B클래스의 객체를 생성합니다.");
	}
}

class C extends B{
	C(){
		super(100); //조상생성자에 알맞게 호출해야 함 (반드시 첫번째 열에서만 사용가능)
		System.out.println("C클래스의 객체를 생성합니다.");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}
