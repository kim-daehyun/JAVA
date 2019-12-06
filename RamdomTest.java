package day2;
public class RamdomTest {
	public static void main(String[] args) {
	
		//rand1을 가지고 1~6사이의 난술ㄹ 만드는 식을 
		//구현하여 sixnum변수에 담아서 출력해 보기
	double rand1 = Math.random();
	System.out.println(rand1);
	double rand2 = rand1 * 7; 
	System.out.println(rand2);
	int sixNum = (int)rand2;
	System.out.println(sixNum);

	double rand3 = rand1*46;
	System.out.println(rand3);
	int Lotto = (int)rand3;
	//int lottoNum = (int)(rand1 * 45)+1;
	System.out.println(Lotto);

	}
}