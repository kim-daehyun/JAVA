package day2;
//식 : int(byte,short,char), String  , long 타입은 변환xx 

public class switchTest { 
	public static void main(String[] args) {

		int score = (int)(Math.random()*100)+1;
		//동일한 기능이 처리되도록 
		//if문을 switch문으로 변경해본다. 
		
		switch(score/10) { 
		case 10:
		case 9:System.out.println(score+":A등급");
		break;
		
		case 8:System.out.println(score+":B등급");
		break;
		
		case 7:System.out.println(score+":C등급");
		break;
		
		case 6:System.out.println(score+":D등급");
		break;
		
		default:System.out.println(score+":F등급");
		break;		
		
		}
		System.out.println("수행종료!!");
		
	}

}
