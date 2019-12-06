package day3;
public class ForLab3 {
	public static void main(String[] args) {

		int rand1 = (int)(Math.random()*10)+1;
		int rand2 = (int)(Math.random()*11)+30; //30~40
		int sum = 0;
		for(int i= rand1; i<=rand2 ; i++) {
			
			if(i%2==0) {
				sum+=i;
			}
				
		}
		System.out.println("rand1의 값:"+rand1);
		System.out.println("rand2의 값:"+rand2);
		System.out.println("rand1 부터 rand2 까지의 짝수의 합:"+sum);
		
	}

}
