package day4;
public class ArrayLab2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = new int[10];
		int sum=0;
		for(int n=0;n<ary.length;n++) {
			ary[n]=(int)(Math.random()*17)+4;
			sum+=ary[n];
		}
		System.out.print("모든 원소의 값:");
		for(int n=0;n<ary.length-1;n++) {
			System.out.print(ary[n]+",");
		}
		System.out.println(ary[9]);
		System.out.println("모든 원소의 합:"+sum);
		
	}

}
