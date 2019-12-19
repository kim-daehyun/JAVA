package day13;
import java.util.*;
public class GenericTestNew {
	public static void main(String[] args) {
		// 제네릭스 라는 구문이 적용되어 만들어진 클래스의 객체 생성시
		// 타입 파라미터라는 것을 사용한다. 
		//<type>에 이 LinkedList는 type으로만 저장할 것이다~!\
		//이에 "100"을 100으로 기입하면 에러남
		//꺼낼때 굳이 형변환을 안해도 됨
		LinkedList<String> list = new LinkedList<String>();  // 타입파라미터
		list.add("java");
		list.add("100");
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		
		for(String value : list) {			
			System.out.println(value);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String s = iter.next();			
			System.out.println(s);
		}
	}
}

