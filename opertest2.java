package day2;
public class opertest2 {
	public static void main(String[] args) {
		
		int lvalue;
		char cvalue;
		double dvalue;
		boolean bvalue;
		
		lvalue = 100;
		cvalue = 'A';
		dvalue = 3.14;
		bvalue = true;
		
		System.out.println(lvalue);
		System.out.println(cvalue);
		System.out.println(dvalue);
		System.out.println(bvalue);
		
		lvalue = cvalue;
		System.out.println(lvalue);
		
		//연산을 처리할 때
		//l-value의 타입과 r-value의 타입은 동일해야 한다. 
		//그런데 만일 다른 타입이 사용되면 r-value의 값이 손실되지 않는 범위에서 
		//l-value의 타입으로 자동 변환된다. 
		//lvalue = dvalue;
		lvalue = (int)dvalue;
		System.out.println(lvalue);
	
		//lvalue = (int)bvalue;
		//형변환에 boolean형은 제외됨
		//byte < short < int < long < float < double
		// char < int < long < float < double
		// short = (short)char
		
	}

}
