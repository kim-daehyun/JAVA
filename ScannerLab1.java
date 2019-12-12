package day8;

import java.util.Scanner;


public class ScannerLab1 {
	
	public static void main(String[] args) {
		int result=0;

		System.out.println("첫 번째 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();

		System.out.println("연산자(+,-,*,/)를 입력하세요 : ");
		String oper = sc.next();
		
		
		
		System.out.printf("%d와 %d의 연산 결과는 %d 입니다.\n",number1,number2,result);
		
		sc.close();
	}

}
