package day6;
public class MethodLab2 {
	public static void main(String[] args) {

		int num1[] = new int[5];
		int num2[] = new int[5];
		int result[] = new int[5];

		for (int i = 0; i < result.length; i++) {
			result[i] = operate(num1[i], num2[i]);
			if (result[i] < 0) {
				result[i] = -result[i];
			}
			System.out.printf("%d %s %d %s %d %s", num1[i], "와", num2[i], "의 차는", result[i], "입니다.");
			System.out.println();
		}
	}
	static int operate(int num1, int num2) { // 메서드 오버로딩
											// 메서드명은 같고 매개변수가 다름
		num1 = (int) (Math.random() * 30) + 1;
		num2 = (int) (Math.random() * 30) + 1;
		return num1 - num2;
	}
}
