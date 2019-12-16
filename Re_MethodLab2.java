package weekend1;

public class Re_MethodLab2 {

	static int differ(int num1, int num2){
		int result =0;
		if(num1 > num2) {
			result = num1 - num2;
		}
		else {
			result = num2 - num1;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arrnum1[] = new int[5];
			int arrnum2[] = new int[5];
			for(int i=0; i<arrnum1.length;i++) {

				arrnum1[i] = (int)(Math.random()*30)+1;
				arrnum2[i] = (int)(Math.random()*30)+1;
				System.out.printf("%d와 %d의 차는 %d입니다.",arrnum1[i],arrnum2[i],differ(arrnum1[i],arrnum2[i]));
				System.out.println();
			}
	}
}
