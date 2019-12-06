package day3;

public class ForLab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char DECO = '&'; //상수는 대문자
		int r = (int)(Math.random()*6)+5;
		for(int rowNum=1;rowNum<=r; rowNum++){
			for(int colNum=1;colNum<=rowNum; colNum++){
			System.out.print(DECO);						
			}		
			
		System.out.println();
		}

	}

}
