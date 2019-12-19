package day12;
/*	java.lang - Object, Math, Integer, String, StringBuffer
 * 				Character
 * 
 * String : 문자열 처리와 관련된 메서드들을 가지고 있다. 
 * 			String 객체가 생성된 이후 초기화된 문자열 내용은 변경 불가하다.
 * 			읽기 용도로만 사용 가능하다. 
 * 			문자형리터럴은 스트링객체이다. 
 * 
 * 			"abc" + "가나다"  -> "abc가나다"
 * 			"가" + "나"+ "다"+ "라"  -> "가나다라"
 *
 * StringBuffer : 문자열을 편집하는 용도
 * 				String은 문자열이 바뀔때마다 객체를 생성한다.
 * 				String을 사용할 때보다 훨씬 메모리를 덜 사용한다.
 * 				toString을 사용해야한다.
 * 				편집을 수차례 해야한다면 StringBuffer을 사용하는 것을 
 * 				추천				
 * 
 * 				StringBuffer sb = new StringBuffer();
 * 				sb.append("a");	
 * 				sb.append("b");	
 * 				sb.append("c");	
 * 				sb.append("d");	
 * 		
 * 		equals():Object클래스 :==연산과 동일
 * 		Book b1 = new Book("짱구", "xxx", 1000);
 * 		Book b2 = new Book("짱구", "xxx", 1000);
 * 		Book b3 = b2;		
 * 
 * 		b1 == b2 ? false (저장되있는 참조값이 다르기에)		
 * 		b3 == b2 ? true (동일객체로 생성)		
 * 		b1.equals(b2)? false (b1과 b2의 참조값이 같은가?)
 * 		b3.equals(b2)? true (b1과 b2의 참조값이 같은가?)
 * 
 * 근데 나는 참조값이 아닌 내용이 같은지 확인하고 싶어 
 * 그럴때는 equals를 overriding해야한다.  
 * 
 * 			
 * */

public class apiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
