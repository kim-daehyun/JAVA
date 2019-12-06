package day2;
/* [연산자]
		 * ++,--,+,-,!,~
		 * *,/,%
		 * 단항 연산자 : ++num(num=num+1)
		 * 이항 연산자 : 항1 연산자 항2 
		 * 삼항 연산자 : 항1?항2:항3 
		 * 			int bigNumber = num1 > num2 ? num1 : num2
		 * ++su, su=su+1, su+=1
		 * 자바에서 비트단위의 연산은 거의 없음
		 */
public class calc {
	public static void main(String[] args) {
		/*
		 *  int num1 = 100;
			int num2 = 50;
		*/
		int num1=100, num2=50;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1!=num2);
		System.out.println(num1>0 && num2>0);
		System.out.println(num1>80 && num2>80);
		System.out.println(num1>0 || num2>0);
		System.out.println(num1>80 || num2>80);
		System.out.println(num1>0 && num2%2==0);
		System.out.println(num1>80 && num2>80);
	
	}

}
