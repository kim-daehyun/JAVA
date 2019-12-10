package day6;

public class MethodLab3 {
	public static void main(String[] args) {
		
		int []a=new int [5];
	for(int i=0;i<a.length;i++) {
		a[i]=getRandom(10);
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i++) {
		a[i]=getRandom(10,20);
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	

}	
	public static int getRandom(int n) { // 메서드 오버로딩
		return (int)(Math.random()*n)+1;
	}
	public static int getRandom(int n1, int n2) { // 메서드 오버로딩
		return (int)(Math.random()*(n2-n1-1))+n1;
	}
}