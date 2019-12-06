
package day4;
/*
 * 1) int타입보다 작은 타입들(byte, short, char)은 int타입으로 변환하여 연산
 * 2) 두 항의 타입이 다를 때 하나로 일치해서 연산(표현 범위가 작은 타입에서 큰 타입으로)
 * 표현 범위의 관계 int<long<float<double
 */
public class CharacterTest3 {
	public static void main(String[] args) {
		char v1 = '가';
		char v2 = '\uAC00'; //가
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println((int)v1);
		System.out.println((int)v2);		
		System.out.println((double)v1);
		System.out.println((double)v2);
	}
}
