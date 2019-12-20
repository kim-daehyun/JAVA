package day14;

import java.util.HashSet;

/*	
class Member3 {
	private int id;
	private String name;
	private String password;
	Member3(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public boolean equals(Object o) {
		if (o != null && o instanceof Member3) {
			Member3 m = (Member3) o;			
			if (id ==  m.id && 
					name.equals(m.name) && 
							password.equals(m.password))
				return true;
		}
		return false;
	}	
	public int hashCode() {
		return id+name.hashCode()+password.hashCode();
	}//id는 그냥 리턴 
	
	public String toString() {
		return "("+id+":"+name+":"+password+")";
	}
}

public class ObjectTest3 {
	public static void main(String args[]) {
		Member3 obj1 = new Member3(10, "자바", "duke");
		Member3 obj2 = new Member3(10, "자바", "duke");
		Member3 obj3 = new Member3(20, "자바", "duke");
		System.out.println(obj1.hashCode());//해시코드 오버라이딩
		System.out.println(obj2.hashCode());//해시코드 오버라이딩		
		System.out.println(obj3.hashCode());//해시코드 오버라이딩	
		HashSet<Member3> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);   //동일한 내용일때는 
		System.out.println("저장된 데이터의 갯수 : " + set.size());
		System.out.println(set);
		//equals와 해시코드 클래스를 생성하지 않으면~~ 해시코드가 다 다르게 나옴
	}
}




