package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		
		for(int i=0;i<r1.length;i++) {
			System.out.print((i==r1.length-1)? r1[i]:r1[i]+"," );
		}
		System.out.println();
		for(int i=0;i<r2.length;i++) {
			System.out.print((i==r2.length-1)? r2[i]:r2[i]+"," );
		}
		System.out.println();
		for(int i=0;i<r3.length;i++) {
			System.out.print((i==r3.length-1)? r3[i]:r3[i]+"," );
			}
		System.out.println();
		
	}
	static int[] powerArray(int n) {
		int dan[]=new int[10];
		int i=0;
		for(i=0;i<dan.length;i++) {
			dan[i]=(i+1)*n;
		}
		return dan;
	}
}
