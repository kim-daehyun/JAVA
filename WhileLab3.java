package day4;

//maxValue 
//char n ='A'-1;  ok  (선언과 동시에 연산할 때는 형변환 필요없음)

//char n;
//n='A'-1;      xxxxx
//n=(char)('A'-1); (처럼 강제 형변환 해줘야 한다)


public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 64;
		int count=0;
		
		while(true) {
			int rand = (int)(Math.random()*31); //변수 선언을 while문 밖에 선언하는 것이 더 효율적
			if(rand>=1&&rand<=26) {
				System.out.print((char)(a+rand));
				System.out.println("("+rand+")");
				count++;
			}
			else {
				System.out.println("수행횟수는 "+count+"번입니다");
				break;
			}

		}
	}

}
