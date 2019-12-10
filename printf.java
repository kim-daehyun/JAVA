package day6;
public class printf {
/*
	System.out.println();, System.out.print();
	1) 출력 데이터를 한개만
	2) 출력데이터 여러개일 때는 +연산자로 결합하여 한 개로 전달해야
	3) 출력하려는 데이터의 타입에 따라 출력 형식이 정해진다. 
	int -> 10진수 숫자
	char -> 문자
	double -> 소수점 이하의 자리수를 설정불가
	java 5(jdk 1.5) 
	System.out.printf();
	System.out.printf("출력하려는 포맷문자열");
	System.out.printf("가나다");
	System.out.printf("가나다\n");	//개행
	System.out.printf("가나다%n");	//개행
	System.out.printf("가나%d다",sum);
	System.out.printf("가나%.2f다", avg);
	
 * */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.printf("테스트입니당\n");		// %n
				System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);
				System.out.printf("%#x %#X %#o\n", 100, 100, 100);
				System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3' );
				System.out.printf("%b\n", true);
				System.out.printf("%f %e\n", 100.0, 100.0);
				System.out.printf("%.2f\n", 123.5678);
				System.out.printf("|%s|\n", "자바");
				System.out.printf("|%10s|\n", "자바");
				System.out.printf("|%-10s|\n", "자바");
				System.out.printf("%,d원\n", 1000000);			
	}
}
