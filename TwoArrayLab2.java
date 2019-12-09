package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] chars= {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'},
		};
		
		int nums[] = new int[4];
		
			for(int r=0; r<chars.length;r++) {
				for(int c=0; c<chars[r].length;c++) {

					switch(chars[r][c]) {
					case 'A':
						nums[0]++;
						break;
						
					case 'B':
						nums[1]++;
						break;
						
					case 'C':
						nums[2]++;
						break;
						
					default:
						nums[3]++;
						break;
					}
				}
			}
			char A= 'A';
			for(int i=0; i<nums.length;i++) {
				System.out.println(A+"는"+nums[i]+"개 입니다.");
				A++;
			}

	}
}