//for(변수선언 : 배열)
package day7;
public class MethodTest10 {
	public static void main(String[] args) {

		int arr[]= {1,3,45,5};
		System.out.println("p1의 값 :"+arr);
		printArray(arr);
		int result[] = updateArray1(arr);
		printArray(result);
		printArray(arr);
		System.out.println("-------------------");
		updateArray2(arr);
		printArray(arr);
		
	}
	static int[] updateArray1 (int p2[]) {
		System.out.println("p2의 값 :"+p2);
		int result[] = new int[p2.length]; //개발자들도 거의 안씀
		for(int i=0;i<p2.length;i++) {
			result[i]=p2[i]*2;
		}
		
		return result;
	}

	static void printArray(int p2[]) {
		for(int data:p2) {
			System.out.printf("%d ",data);
		}
		System.out.print("\n");
	}

	
	
	static void updateArray2(int p3[]) {
		System.out.println("p3의 값 :"+p3);
		for(int i=0;i<p3.length;i++) {
			p3[i]=p3[i]*2;


	}

}
}
