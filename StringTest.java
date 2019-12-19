package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("가나다".length()); 					
		System.out.println("abc".charAt(1)); 			
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4)); //4번쨰부터 끝까지   		        
		System.out.println(str1.substring(0, 3)); //0~2번째 까지 		
		System.out.println(str2.indexOf("f"));  //앞에서 부터     		  
		System.out.println(str2.lastIndexOf("f")); //뒤에서부터     
		System.out.println(str2.replace('h', 'H')); 	    
		
		//단어의 개수, 문자열의 개수
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":"); //:을 기준으로 출력  
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray(); //한글자씩 배열에 담아서 저장
		System.out.println(str3.length() + " ---- " + ch.length);
		System.out.println(ch);  //char형 배열은 한줄로 가지고 있는 원소를 다 출력한다. 
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













