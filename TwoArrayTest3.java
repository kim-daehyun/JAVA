package day5;

public class TwoArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] nums= {
						{10,12,14,16},
						{18,20,22,24},
						{26,28,30,32},
						{34,36,38,40}
		};		
		System.out.println("1행 1열의 데이터"+nums[0][0]);
		System.out.println("3행 4열의 데이터"+nums[2][3]);
		System.out.println("행의 갯수"+nums.length);
		System.out.println("열의 갯수"+nums[3].length);
		System.out.print("왼쪽 대각선 데이터들 :");
	
		for(int row=0; row<nums.length;row++) {
		for(int col=0; col<nums[row].length;col++) {

			if(row==col) {
				System.out.print(nums[row][col] +" ");

			}
			
		}
	}
	
	System.out.println();
	System.out.print("오른쪽 대각선 데이터들 :");
		
		for(int r=0; r<nums.length;r++) {
			for(int c=0; c<nums[r].length;c++) {

				if((r+c)==nums.length-1) {
					System.out.print(nums[r][c] +" ");
				}
			}
		}
	}
}