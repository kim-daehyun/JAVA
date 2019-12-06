package day3;

public class OperTest {

	public static void main(String[] args) {
		
		//조건연산자를 사용하여 
		//a,b
		//1~10 사이의 수 중 1~3은 a, 4~10은 b
		//()?a:b
		int a = 0,b=0;
		int rand = (int)(Math.random()*10)+1;
		int result1 = (int) ((rand>3)?(a=rand):(b=rand)) ;
	
	}

}
