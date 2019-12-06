package day2;

public class oper_test {

	public static void main(String[] args) {
		//증감연산자 : 증가연산자(++), 감소연산자(--)
		// ++=, -- 둘다 앞뒤에 연산이 가능
		int su1, su2, su3, su4;
		su1 = 10;
		System.out.println(su1);
		System.out.println(++su1);
		System.out.println(su1++);

		su2 = 100;
		System.out.println(su2);
		System.out.println(--su2);
		System.out.println(su2--);

		su3 = 1000;
		System.out.println(su3); //1000
		System.out.println(su3++);//1000
		System.out.println(++su3);//1002
		System.out.println(su3++);//1002
		System.out.println(--su3);//1002
		System.out.println(--su3);//1001
		
		su4 = 20;
		System.out.println(su4); //20
		++su4;
		System.out.println(su4);//21
		su4++;
		System.out.println(su4);//22
		
		System.out.println(--su4);//1001
		
		/* ++, --의 대상은 항상 변수이어야 한다.
		 * l-value : 방 = 변수
		 * r-value : 값 = 식(변수,리터럴)
		 */
	}

}
