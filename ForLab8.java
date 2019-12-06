package day3;

public class ForLab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char DECO = 'A'; //상수는 대문자
		for(int rowNum=1;rowNum<=5; rowNum++){
			for(int colNum=1;colNum<=rowNum; colNum++){
			System.out.print(DECO++);						
			}		
			
		System.out.println();
		}

	}

}
