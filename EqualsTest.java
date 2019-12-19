package day12;
//(v1.equals(v2))  값을 비교
//v1==v2 참조값을 비교 
import java.util.Date;

class Value {
	int value;
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
        if(obj != null && obj instanceof Value) //같은 객체인지 확인하는 작업
        	if(value == ((Value)obj).value)		//객체의 내용과 내용을 비교하는 작업
        		result = true;
		return result;
    }
	
}
public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); // f
		System.out.println(v1.equals(v3));   // f
		System.out.println(v1.equals(v2));   // t
		System.out.println(v1.equals(new Date()));   //f 
		if(v1==v2) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if(v1==v2) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		String s4 = new String("가나다");
		
		System.out.println(s1 == s2);	//t    //같은 문자형리터럴 사용하면 객체는 하나만 만들어져서 사용됨
		System.out.println(s3 == s4);	//f
		System.out.println(s1.equals(s2)); //t
		System.out.println(s3.equals(s4)); //t
		
	}
}
