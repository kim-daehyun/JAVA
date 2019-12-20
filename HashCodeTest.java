package day14;
public class HashCodeTest {
	public static void main(String[] args) {
		String s1 = new String("듀크");
		String s2 = new String("듀크");
		String s3 = new String("듀크");
		String s4 = new String("듀크");
		String s5 = "듀크";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		String s6 = new String("고길동");
		String s7 = new String("듀크1");
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		
		/*hashcode를 객체 마다 오버라이딩 해야한다.
		*이미들어간것과 들어갈것에 대한 체크를 해야하는데.,.,
		*해시코드를 오버라이딩하지 않으면 키가 될 수 없다 
		*동일한지 안한지 체크를 할 수가 없다. 
		*/
	}
}
