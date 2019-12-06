package day3;

public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10부터 1까지의 숫자에 대해 숫자값과 해당 숫자의 제곱값을
		//행단위로 출력해보자
		for(int n=10;n>=1;n-- )
		{
			System.out.println(n+":"+n*n);
		}
		
		System.out.println("----------");
	
		//10부터 20까지의 숫자에 대하여 3씩 증가시키면서
		//숫자값과 해당 숫자의 제곱값을 행단위로 출력
		//초기식과 증감식에 식을 여러개 작성해도 가능
		for(int n=10;n<=20;n+=3 )
		{
			System.out.println(n+":"+n*n);
		}
		
		System.out.println("----------");
	}
}
