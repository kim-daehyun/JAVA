package day11;

import java.util.Random;

class DuplicateException extends Exception {

	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");
	}
}

class LottoMachine {
	private int nums[];

	public LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		Random rd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(19) + 1;
		}
	}

	public void checkLottoNums() throws DuplicateException {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					throw new DuplicateException();
				}

			}

		}
	}

	public int[] getNums() { // 배열로 리턴받음

		return nums;
	}
}

public class LottoGame {

	public static void main(String[] args) throws DuplicateException {
		int arr[];

		// 1. LottoMachine의 객체를 생성한다.
		LottoMachine LM = new LottoMachine();
		// 2. createLottoNums()를 호출하여 로또 번호들을 배열에 구성한다.
		LM.createLottoNums();

		try {
			// 3. checkLottoNums()를 호출하고
			LM.checkLottoNums();
		} catch (DuplicateException e) {
			// TODO: handle exception
			System.out.println("에러 메시지 :" + e.getMessage());
			
			arr = LM.getNums();
			System.out.print("(");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ((i != arr.length - 1) ? "," : ""));
			}
			System.out.print(")");
			
			return;

		}
		// 예외가 발생하지 않으면 getNums() 를 호출하여 로또 넘버들을 화면
		// 에 출력(x, x, x, x, x, x)하고 예외가 발생하면 예외 메시지
		// (“중복된 로또 번호가 발생했습니다”)를 출력하고 종료한다.
		arr = LM.getNums();
		System.out.print("(");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이게뜨면 여기까지 내려온다는거" + arr[i] + ((i != arr.length - 1) ? "," : ""));
		}
		System.out.print(")");
	}
}
