package day4;
public class arrayTest1 {
/*
 * 배열
 * 동일한 타입의 데이터들의 집합
 * 배열을 만드는 방법
 * 배열을 사용하는 방법
 * 여러개의 데이터들을 프로그램에서 다뤄야 할 때 변수를 여러개 선언하여 사용하는 
 * 것은 비효율적이다. 
 * 배열을 만드는 바업ㅇ
 * 배열로 구성하려는 데이터들의 타입
 * 배열로 구성하려는 데이터들의 최대갯수
 *new 데이터타입[크기]
 *new int[10]    ==== 0 4바이트 공간을 10개 만들어질때 0으로 초기화됨 *
 *new char[26]   ==== '\u0000'
 *new double[26] ==== 0.0
 *new long[26] ====0L
 **new boolean[26] ==== false 들이 기본형
 *
 *[값1,값2,값3] -----> 배열생성과 배열변수 선언을 동시에 할 때
 *[10,20,30],['a','b','c'],[true]
 *
 *-배열을 사용하는 방법
 *배열을 사용하기 위해서는 배열을 만든다음 변수에 담는다. 
 *배열변수가 필요하다
 *타입[] 변수명;, 타입 변수명[];
 *int a1[];, int[] a2;, char[] a3; boolean a4[];
 *int a1[] = new int[10]; 
 *int a2[] = [10,20,30];
 *a2[0],a2[1],a2[2]
 *배열변수명 [인덱스] //인덱스는 0부터 시작한다.
 *배열을 구성하는 데이터들 : 엘리먼트(element), 요소, 원소
 *	System.out.println(a1[0]);
 * for(int 1=0; i<a1.length;i++)
 * System.out.println(a1[i]);
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]=new int[10];
		System.out.println(a1.length);
		int a2[]= {10,20,30};
		System.out.println(a2.length);
		
		for(int i=0; i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<a2.length;i++) {
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<a1.length;i++) {
			a1[i] = (i+1)*100;
		}
		for(int i=0; i<a1.length;i++) {
			System.out.print(a1[i]+" ");
			}
		System.out.println();
	
//		a2[3]=100;
		
	}

}

















