package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand = (int)(Math.random()*5)+1;
		System.out.println("rand값:"+(rand));
		System.out.print("결과값:");
		switch(rand) { 
		case 1:
			System.out.println((300+50));
			break;
		case 2:
			System.out.println((300-50));
			break;
		case 3:
			System.out.println((300*50));
			break;
		case 4:
			System.out.println((300/50));
			break;
		default:
			System.out.println((300%50));
			break;
		}
	}
}
