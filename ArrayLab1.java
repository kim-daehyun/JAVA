package day4;
public class ArrayLab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = new int[10];
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<ary.length;i++) {
			ary[i] =(i+1)*10 ;
			System.out.print(ary[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<ary.length;i++) {
			ary[i] =100 - ((i)*10)  ;
			System.out.print(ary[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<ary.length;i++) {
			ary[i] = (i+1)*20 ;
			if(ary[i]<=100) {
			System.out.print(ary[i]+ " ");
			}
		}
		System.out.println();
	}

}
