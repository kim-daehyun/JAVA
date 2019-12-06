package day3;

public class ForTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A~Z까지 출력해보자
		char munja='A';
		for(int i=1; i<=26;i++)
		{
			System.out.print(munja++);
		}
		System.out.println("\n-------------");
		
		for(munja='A'; munja<='Z';munja++)
		{
			System.out.print(munja);
		}
		System.out.println("\n-------------");
		
		munja='A';
		for(int i=1; i<=26;i++)
		{
			System.out.print(munja);
			munja= (char)(munja+1);
		}
		System.out.println("\n-------------");
	}

}
