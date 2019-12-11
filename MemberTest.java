package day7;

class Member {
	String name;
	String account;
	String passwd;
//	int birthyear;

	Member(String p1, String p2, String p3) {
		name = p1;
		account = p2;
		passwd = p3;
	}

	void Info(int birthyear) {
		System.out.println(name + "(" + account + "," + passwd + "," + birthyear + ")");
	}
}

public class MemberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mb1 = new Member("히히히", "eogus2116@gmail.com", "qqq");
		mb1.Info(1999);
		Member mb2 = new Member("emma", "qwer@hanmail.com", "eee");
		mb2.Info(1998);
		Member mb3 = new Member("tommy", "rtryy@naver.com", "uuu");
		mb3.Info(1991);
		Member mb4 = new Member("han", "ghj@gmail.com", "ooo");
		mb4.Info(1994);
		Member mb5 = new Member("seo", "asdc@gmail.com", "ppp");
		mb5.Info(1993);
	}
}
