/*[문자셋(charset)]
 * ASCII : 0x00~0x7f(ibyte)
 * 		   0x41~영문 대문자, 0x61~영문 소문자..
 * 
 * 		   ~1986년 : 표준화된 한글 코드가 없었다.
 * 					컴퓨터마다 한글 코드가 달랐다.
 * 
 * 		   ~1987년 : 표준화된 한글 코드 완성형 한글 코드  
 * 					KSC5601 : 영문(1byte:ASCll, 한글(2byte))	
 *				   (EUC-KR,MS949(CP949))
 *				    0x80A1 ~ 가.. 
 * 					native code : 나라 고유 코드
 * 
 * 		   ~1990년 : 전세계의 나라코드를 통일 시키자 unicode : 
 * 								(2byte: utf-16,utf16)
 * 								A:0x0041, 가 : 0xAC00
 * 								
 * 								(1byte: utf-8,utf8)
 *								A:0x41, 가 : 0xEA8080 								
 * OS - MS949
 * Java - utf-16
 * Web - utf-8 
 * 
 * [입출력(I/O)프로그래밍 API]
 * -java.io.javax.nio
 * --------
 * -File : 시스템에 존재하는 파일에 대한 처리, 정보 추출.....
 * -입력용 API, 출력용 API
 * 입력단위 : 바이트 단위, 문자 단위	
 * 			(1.0)	(1.1)
 * 			------------> InputStreamReader (바이트 단위에서 문자단위 출력할 때 변환해주는 클래스)
 * 
 * 어떻게 하면 운영체제에 무관한 api를 만들까??
 * io 장치와 언어 구조상의 Stream이라는 논리 구조를 이용한다. 
 * Stream이라는 논리적인 구조를 이용한다. 이는 단방향으로 처리한다.  
 * 입력 스트림과 출력 스트림으로 구분한다.  출력용은 바이트 단위인지, 문자단위인지 고려하여 사용해야 한다. 
 *
 * 이를 어떻게 구분하는지??
 * ~~~InputStream, ~~~OutputStream : 바이트 스트림
 * ~~~Reader, ~~~Writer : 문자 스트림
 * 
 * 문자스트림
 * FileReader, FileWriter - 파일 오픈 기능
 * BufferedReader, BufferedWriter
 * 
 * 바이트스트림
 * FileInputStream, FileOutputStream - 파일 오픈 기능
 * DataInputStream, DataOutputStream  
 * ObjectInputStream, ObjectOutputStream  
 * 
 * InputStreamReader, OutputStreamWriter
 *
 *
 *\s : 공백을 의미
 * *:0개 이상
 *  ab* : ab로 시작하는 모든 것을 찾음 (ab로 시작하는 것에 대해 공백이 0개 이상인 것을 다 출력ㄱ)
 * */




package day14;
public class API_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
