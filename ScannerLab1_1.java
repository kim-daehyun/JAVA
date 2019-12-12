package day8;

import java.util.Scanner;

public class ScannerLab1_1 {

		public static void main(String[] args) {
			int result =0;
			System.out.println("첫 번째 숫자를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int	a = sc.nextInt();
			
			System.out.println("두 번째 숫자를 입력하세요 : ");
			int b = sc.nextInt();

			System.out.println("연산자(+,-,*,/)를 입력하세요 : ");
			String oper = sc.next();
			
			switch(oper) {
			case "+":
				result = a+b;
				break;

			case "-":
				result = a-b;
				break;
				
			case "/":
				result = a/b;
				break;
				
			case "*":
				result = a*b;
				break;
				
			default:
				System.out.printf("+,-,*,/를 입력하숑");
			}
			
			System.out.printf("%d와 %d의 연산 결과는 %d 입니다.\n",a,b,result);
			sc.close();

	}

}
