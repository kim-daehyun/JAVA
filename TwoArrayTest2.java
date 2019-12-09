package day5;

public class TwoArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[10];
		char a2[] = {'가','나','다'};
		double a3[] = new double[5];
		
		System.out.println(a1.length+":"+a2.length+":"+a3.length);
		System.out.println(a1+"-"+a1[0]);//[I@15db9742-0 @뒤에 있는 것이 참조값
		System.out.println(a3+"-"+a3[0]);//[D@6d06d69c-0.0 @뒤에 있는 것이 참조값
		System.out.println(a1+"-"+a2[0]);//[D@6d06d69c-0.0 @뒤에 있는 것이 참조값

		/* new 타입 [행의 크기][열의 크기]
		 * 타입 [][]변수명;
		 * 타입 변수명[][];
		 * 타입 [] 변수명[];
		 * */
		int[][] a4 = new int[5][12];
		System.out.println(a4);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);
		System.out.println(a4[4]);
		System.out.println(a4[0].length);
		System.out.println(a4[1].length);
		System.out.println(a4[2].length);
		System.out.println(a4[3].length);
		System.out.println(a4[4].length);
	}

}
