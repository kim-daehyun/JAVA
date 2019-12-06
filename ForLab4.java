package day3;
public class ForLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rand1 = (int)(Math.random()*8)+3; //3~10
		int rand2 = (int)(Math.random()*3)+1; //1~3
		
		//조건연산자
		//rand1,rand2
		//1~10 사이의 수 중 1~3은 rand1, 3~10은 rand2
		//()?rand1:rand2
		
		System.out.println("rand1의 값:"+rand1);
		System.out.println("rand2의 값:"+rand2);
		
		switch(rand2) {
		case 1:
			for(int i=1; i<=rand1;i++)
			System.out.print("*");
			break;
		case 2:
			for(int i=1; i<=rand1;i++)
			System.out.print("$");
			break;
		case 3:
			for(int i=1; i<=rand1;i++)
			System.out.print("#");
		
		}
		
	}
	
	
}