package day6;	
/*
 * 프로그램 아규먼트(명령행 데이터)
 * 프로그램을 수행 시작시키면서 최초에 한번만 전달되는 데이터들을 의미함
 * main(String[] args)(Integer.parsInt()를 이용해서 숫자로 변환하여 사용한다.(문자형)
 * (Double.parseDouble()를 이용해서 숫자로 변환하여 사용한다.(실수형)
 * */
public class MethodTest7_2 {
	public static void main(String[] args) {

		int result = 0;
		for(int i=0;i<args.length;i++) {
			result=result+Integer.parseInt(args[i]);
		}
		System.out.println(result);
		
		
	}
}
