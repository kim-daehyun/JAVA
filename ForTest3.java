package day2;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=5;num++)
			System.out.print(num+" ");
		System.out.println();
		
		for(int num=20;num>=1;num--)
			System.out.print(num+" ");
		System.out.println();
		
		for(int num=20;num>=1;num-=3)
			System.out.print(num+" ");
		System.out.println();
		
		int num; //변수 초기화
		
		
		for(num=10;num>=1;num-=3)
			System.out.print(num+" ");
		System.out.println();
		System.out.println(num); //변수를 초기화 하면 다음과 같이 for문 밖에서도 num변수 사용가능함
		}

}
