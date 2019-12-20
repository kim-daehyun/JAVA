//입.출력, 문자.바이트 , 행.문자

package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputClass {
	public static void main(String[] args) throws Exception {
		
		System.out.print("입력 : ");  
		//int input = new InputStreamReader(System.in).read();  //하나만 읽어간다
		//InputStreamReader (바이트 단위에서 문자단위 출력할 때 변환해주는 클래스)
		//1문자를 읽는 것에 1바이트 필요함
		//System.out.println("출력:"+(char)input);  //1문자만 읽는다아
		
		String input = new BufferedReader(
						new InputStreamReader(System.in)).readLine();
		//한 행만 읽어간다. 
		System.out.println("출력 : "+input);
		
		
		
	}
}
