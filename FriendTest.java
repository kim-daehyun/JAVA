package day13;
//import 선언!!
import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;

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

public class FriendTest {

	public static void main(String[] args) {
		//
		LinkedList<Friend> friend = new LinkedList<>();
        friend.add(new Friend("해리", "010-1234-5578", "happy@gmail.com"));
        friend.add(new Friend("헤르미온느", "010-5555-5578", "happy@naver.com"));
        friend.add(new Friend("도비", "010-9874-6578", "dont@gmail.com"));
        friend.add(new Friend("론", "010-1234-9578", "do@gmail.com"));
        friend.add(new Friend("말포이", "010-1234-6578", "that@gmail.com"));
		
        
		
        //방법2
        System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");
        Iterator<Friend> it = friend.iterator();
        while(it.hasNext()) {
//        	 it.next();
//        	Friend fri = it.next();
        	System.out.println(it.next());
        
        }
		
		//방법1 
		System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");
		int num = friend.size();
		for (int i = 0; i < num; i++) {
			Friend info =friend.get(i);

			System.out.println(info.getInfo());
		}
		
		System.out.println("이름\t" + "전화번호\t\t" + "메일주소");
		System.out.println("------------------------------------");
//		int num = friend.size();
	
		for (Friend data: friend) {
			Friend info =friend(data);
			
			System.out.println(info.getInfo());
		}
	}
	
	
}
