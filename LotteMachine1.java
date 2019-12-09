package day5;

public class LotteMachine1 {

	public static void main(String[] args) {

		int num[] = new int[10];
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]=(int)(Math.random()*10)+1);
			System.out.print(" ");
		}
		
		System.out.println();
		for(int i=0; i<num.length;i++) {
			boolean changed = false;
			for(int j=0; j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					changed = true;
			}
		}
			if(!changed) {
				break;
			}	

	}
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
			System.out.print(" ");
		}

	}
}