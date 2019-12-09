package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]emp = new int[4][];
		emp[0]=new int[5];
		emp[1]=new int[3];
		emp[2]=new int[4];
		emp[3]=new int[9];
			for(int row=0; row<emp.length;row++) {
					switch(row) {
					case 0:
						for(int col=0; col<emp[row].length;col++) {
							for(int i=10; i<=50;i+=10) {
								emp[row][col]=i;
								break;
						}
					}
					case 1:
						for(int col=0; col<emp[row].length;col++) {
							for(int i=5; i<=15;i+=5) {
								emp[row][col]=i;
								break;
							}
						}
					case 2:
						for(int col=0; col<emp[row].length;col++) {
							for(int i=11; i<=44;i+=11) {
								emp[row][col]=i;
								break;
						}
					}
					default:
						for(int col=0; col<emp[row].length;col++) {
							for(int i=9; i<=1;i-=1) {
								emp[row][col]=i;
								break;
						}
					}
					
			}
		}
		
		for(int row=0; row<emp.length;row++) {
			for(int col=0; col<emp[row].length;col++) {
				
				System.out.print(emp[row][col]+" ");
				
				}
			System.out.println();
			}
	}
}
		
		
		
		
		
		