package day4;
public class ArrayLab4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i_ary = new int[10];
		char[] c_ary = new char[10];
		for(int n=0;n<i_ary.length;n++) {
			i_ary[n]=(int)(Math.random()*26)+1;
		}

		for(int n=0;n<c_ary.length;n++) {
			c_ary[n]=(char)(i_ary[n]+64);
		}

		for(int n=0;n<i_ary.length-1;n++) {
			System.out.print(i_ary[n]+",");
		}
		System.out.println(i_ary[9]);
		for(int n=0;n<c_ary.length-1;n++) {
			System.out.print(c_ary[n]+",");
		}
		System.out.println(c_ary[9]);
	}
}

