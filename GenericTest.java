package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//LinkedList안에 어떠한 객체를 생성할지를 기입해야 함
		//제너릭스에 대한 정보를 기입해야함 기입안하면 object으로 인식함
		//숫자 100을 넣으면 알아서 integer로 기입됨
		//ClassCastException는 runtime_error이기에 직접 예외처리 안해도됨
		//본인이 원하는 예외처리가 있다면 try-catch문 기입ㄱㄱ
		//compile error와 실행error는 매우큰 차이를 보인다
		//제너릭구문을 사용하는 이유다.
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");
		
		//방법1 - 속도가 제일 느리다
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		

		//방법2 - 속도가 제일 빠르다 
		for(Object value : list) {
			String s = (String)value;		
			System.out.println(s);
		}
		System.out.println();		
		
		//방법3 - Iterator는 인터페이스 그 안에 hasNext메서드가 있다.
//				이는 다음에 가져올 데이터가 있는지 확인하는 용도로 쓰인다 
//				hasNext가 참일때까지 수행ㄱ
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
	}
}
