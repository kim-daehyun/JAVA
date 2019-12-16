package weekend1;

public class Re_MethodLab4 {

	static int maxNumArray(int Numarray[]) {
		int max = Numarray[0];
		for (int i = 1; i < Numarray.length; i++) {
			if (max < Numarray[i]) {
				max = Numarray[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int array[][] = { { 10, 20, 30 }, { 100, 500, 300, 200, 400 }, { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 }
		};
		for (int i = 0; i < array[i].length; i++) {
			System.out.printf("가장 큰 값은 %d 입니다\n", maxNumArray(array[i]));
		}

	}

}
