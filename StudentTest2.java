package day7;

/*생성자 메서드 constructor
 * 클래스로 인스턴트 생성할 때 호출되는 메서드
 *  new 클래스명()
 *      ---------생성자 메서드
 *  모든 클래스는 1개 이상의 생성자 메서드를 가지고 있어야 한다. 
 *  클래스의 소스에 생성자 메서드가 정의되어 있지 않으면 컴파일러가 생성자를 만들어 준다. --> 디폴트 생성자
 *  생성자 메서드 정의 방법 
 *  1)메서드 명은 클래스명과 동일해야 한다.
 *  2)매개변수는 선택적이다(오버로딩가능하다).
 *  3)리턴값의 타입은 생략한다.
 *  4)객체생성시 수행해야 하는 기능 또는 객체 생성시 데이터를 전달받아서 멤버변수들의 값을 초기화한다.
 * */
class StudentNew {
	String name;
	int age;
	String subject;

	StudentNew(String p1, int p2, String p3) {
		name = p1;
		age = p2;
		subject = p3;

	}

	void printStudentInfo() {
		System.out.println(name + " 학생은 나이가 " + age + " 입니다. ");
	}

	void study() {
		System.out.println(name + " 학생은 " + subject + " 과목을 학습합니다. ");
	}

	void study(int hour) {
		System.out.println(name + " 학생은 " + subject + " 과목을 " + hour + " 동안 학습합니다. ");
	}
}

public class StudentTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentNew st1 = new StudentNew("듀크", 25, "자바");
		System.out.println(st1);
		st1.study(2);
		StudentNew st2 = new StudentNew("둘리", 27, "자바스크립트");
		System.out.println(st2);
		st2.study(2);
	}

}
