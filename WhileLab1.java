package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+5;
		for(int i=1; i<=num;i++) {
			System.out.println(i+"->"+i*i);
		}
		System.out.println("---------------------");
		int i =1;
		while(i<=num) {
			System.out.println(i+"->"+i*i);
			i++;	
		}
	}
}
