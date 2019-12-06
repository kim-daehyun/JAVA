package day2;
public class SwitchLab {
	public static void main(String[] args) {

				int grade = (int)(Math.random()*6)+1;
				
				switch(grade/4) { 
				case 0:
				
					System.out.println(grade+"학년은 저학년 입니다.");
					break;
				
				default:
					System.out.println(grade+"학년은 고학년 입니다.");
					break;
				}	
				
				
		
		
	}
}
