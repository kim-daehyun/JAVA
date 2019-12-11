package day7;
class Student{
	String name;
	int age;
	String subject;
	void printStudentInfo() {
		System.out.println(name+"학생은 나이가"+age+"입니다.");
	}
	void study() {
		System.out.println(name+"학생은 나이가"+subject+"과목을 학습합니다.");
	}
}
public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		System.out.println(st1);
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.subject);
		st1.printStudentInfo();
		st1.study();
		st1.name="듀크";
		st1.age=24;
		st1.subject="html5";
		st1.printStudentInfo();
		st1.study();
		System.out.println();
		
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.subject);
		st2.printStudentInfo();
		st2.study();
		st2.name="해리";
		st2.age=87;
		st2.subject="CCC";
		st2.printStudentInfo();
		st2.study();
		System.out.println("st2=st1 수행");
		
		System.out.println();
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
		st1.printStudentInfo();
		st1.study();
		st2.printStudentInfo();
		st2.study();
		
		
	}

}
