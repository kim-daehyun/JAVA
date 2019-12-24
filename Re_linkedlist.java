package weekend2;
import java.util.Iterator;
import java.util.LinkedList;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}

}

class Friend extends Person {
	private String phoneNum;
	private String email;

	public Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {  //오버라이딩 public 삭제하면 에러 부모클래스보다 범위가 작으면 안된다(같거나 넓히는 것은 가능하다). 

		return super.getInfo() + "\t" + phoneNum + "\t" + email;
//		return String.format("%-20s%-20s%-20s\n",super.getInfo(),phoneNum,email);
	}

}

public class Re_linkedlist {

	public static void main(String[] args) {

		LinkedList<Friend> alist = new LinkedList<Friend>();
		
		Friend f[] = new Friend[5];
		
		
//		Friend f[] = new Friend[5]; // Friend 타입의 객체들을 저장
		
		
		f[0] = new Friend("해리", "010-1234-5578", "happy@gmail.com");
		f[1]=new Friend("헤르미온느", "010-5555-5578", "happy@naver.com");
		f[2]=(new Friend("도비", "010-9874-6578", "dont@gmail.com"));
		f[3]=(new Friend("론", "010-1234-9578", "do@gmail.com"));
		f[4]=(new Friend("말포이", "010-1234-6578", "that@gmail.com"));
		
		for(int i=0;i<f.length;i++) {
			alist.add(f[i]);
		}
		
		
		System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getInfo());
		}
		
		System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");
		for (Friend data : f) {
			System.out.println(data.getInfo());
		}
		
		System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");

		Iterator it = alist.iterator();
		while(it.hasNext()) {
			Friend data = (Friend) it.next();
			System.out.println(data.getInfo());
		}
		
		
		
	}
}
