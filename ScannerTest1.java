/*표준입력
 * 프로그램이 수행하는 동안 필요로 하는 데이터를 시스템의 표준 입력 장치로 부터 받아오는 것을 의미한다. 
 * 표준입력장치 ----> 키보드 이것을 api를 활용한다
 * 자바에서는 표준입력을 어떻게 처리하는가  --->System.in 이라는 변수를 이용한다. 
 * System.in.read() ----> 한글을 깨뜨린다는 단점이 있다, 문자열로만 인식한다
 * 자바 5(JDK 1.5)부터 java.util.scanner 클래스를 제공하여 좀 더 편하게 데이터 입력받을 수 있게 api를 추가함
 * Scanner scan = new Scanner(System.in);
 * 
 * scan.next();   //
 * scan.nextLine();
 * scan.nextInt();
 * scan.nextDouble();
 * 
 * */
package day8;
import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close();
	}
}
