package day13;

import java.util.*;

public class re_LottoMachine2 {
	public static void main(String[] args) {
		int rand;
		HashSet<Integer> hs = new HashSet<>();
		while (true) {
			rand = new Random().nextInt(21) + 10;
			hs.add(rand);
			if (hs.size() == 10) {

				break;
			}
		}
		System.out.println("오늘의 로또 번호 :" + hs);
	}

}
