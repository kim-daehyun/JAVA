//ArrayList 클래스의 기본 리스트 크기는 10임

package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); //String s2 = o2.get();이렇게 하면 에러뜸 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();		//원래 이렇게 해야함new Value3<String>();
		o3.put("abc");
		String s3 = o3.get(); //String s3 = o3.get();이렇게 안해도 에러안뜸 
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());  //new Date()자리에 date 객체가 안오면 에러뜸
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}


class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}

//value1와 value2는 obj의 선언타입만 다름, 부모타입으로 받을때-자손의 타입이 더 작을때는 형변환ㄱ 
class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// Value3<Card> v = new Value3<card>();            //객체 생성시점에서 타입을 정하겠다.
// Value3<String> v = new Value3<String>();			//객체가 처리할 타입을 일반화 시킨다. 
													//실행하는 시점에서 타입을 정한다. 

class Value3<TT> {    //제네릭스안에 의미하는 바가 아무 의미없다 - TT  TT는 타입매개변수
	TT obj;  
	void put(TT obj){
		this.obj = obj;
	}
	TT get() {
		return obj;
	}
}













