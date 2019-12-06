package day3;

public class ForLab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char DECO = '*'; //상수는 대문자
		for(int rowNum=7;rowNum>=1; rowNum--){
			for(int colNum=1;colNum<=rowNum; colNum++){
			System.out.print(DECO);						
			}		
			
		System.out.println();
		}

	}

}
