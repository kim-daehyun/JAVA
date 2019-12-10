package day6;
public class MethodLab1 {
	public static void main(String[] args) {

		print('@',3);
		print('%',4);
		print('A',5);
		print('가',3);
	}
		static void print( char deco, int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(deco);
		}
		System.out.println();
	}
	

}
