package weekend1;
public class Re_MethodLab5 {

	static int[] powerArray(int dan) {
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=dan*(1+i);
		}
		return arr;
	}
	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		for(int i=0; i<r1.length-1;i++) {
			System.out.print(r1[i]+ ",");
		}
		System.out.println(r1[r1.length-1]);
		for(int i=0; i<r1.length-1;i++) {
			System.out.print(r2[i]+ ",");
		}
		System.out.println(r2[r2.length-1]);
		for(int i=0; i<r1.length-1;i++) {
			System.out.print(r3[i]+ ",");
		}
		System.out.println(r3[r3.length-1]);
		
	}

}
