package weekend1;

public class Re_TwoArrayLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int two_array[][] = new int[4][];
		int sum[] = new int[4];
//		two_array[0][]= new int [0][5];   

		two_array[0] = new int[5];     //각 배열의 크기 생성 
		two_array[1] = new int[3];	   //배열 생성하는 거 헷갈렸음.,
		two_array[2] = new int[4];
		two_array[3] = new int[9];

		for(int j=0;j<two_array[0].length;j++) {
			two_array[0][j] += 10;
//			two_array[0][j] = two_array[0][--j] + 10;
//			System.out.print(two_array[0][j]);
			sum[0] += two_array[0][j];
		}
		
		
		for(int j=0;j<two_array[1].length;j++) {
			two_array[1][j] += 5;
			sum[1] += two_array[1][j];
				
		}
		for(int j=0;j<two_array[2].length;j++) {
			two_array[2][j] += 11;
			sum[2] += two_array[2][j];
			
		}
		two_array[3][0]=two_array[3].length;
		for(int j=0;j<two_array[3].length;j++) {
			sum[3] += two_array[3][j];
			two_array[3][j]--;
			
		}
		
		for(int i=0;i<sum.length;i++) {
		System.out.printf("%d행의 합은 %d입니다",i+1,sum[i]);
		System.out.println();
		}
	}

}
