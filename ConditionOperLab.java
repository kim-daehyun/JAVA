package day2;
public class ConditionOperLab {
	public static void main(String[] args) {

		int rand = (int)(Math.random()*6);
		if(rand == 1)
			System.out.println("결과값:"+ (300+50));
		else if(rand == 2)
			System.out.println("결과값:"+ (300-50));
		else if(rand == 3)
			System.out.println("결과값:"+ (300*50));
		else if(rand == 4)
			System.out.println("결과값:"+ (300/50));
		else 
			System.out.println("결과값:"+ (300%50));
		
	}

}
