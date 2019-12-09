package day5;

public class LotteMachine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rand;
		int []LM=new int[45];
		for(int n=0; n<LM.length; n++) {
			LM[n] = n+1;
		}
		int temp=0;
		int i=0;
		
		for(int j=0; j<6;j++) {
			i = (int)(Math.random()*45)+1;
			temp = LM[j];
			LM[j] = LM[i];
			LM[i] = temp;
		}
		System.out.print("오늘의 로또 번호 - ");
		for(int j=0; j<5;j++) {
			System.out.print(LM[j]+", " );
		}
		System.out.println(LM[5]);
	}

}
