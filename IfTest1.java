package day2;
/*정의된 수행 문장들을 한번씩 순차적으로 수행하면서 진행
 * 하는 것이 기본이지만 조건에 따라 수행 문장들을 선택
 * 하여 수행하거나 반복해서 여러번 수행토록 하고자 할 때
 *
 *-(선택)조건제어문 - if(else), switch 
 *-반복제어문 for(횟수) ,while(기능수행) , do-while 
 *-분기제어문 break, continue
 */
public class IfTest1 {
	public static void main(String[] args) {
			
		System.out.println("문장1");
		System.out.println("문장2");
		
		if((int)(Math.random()*10)+1>5)
			System.out.println("문장3");
		else{
			System.out.println("문장4");
			System.out.println("문장5");
		}
		System.out.println("문장6");
	}

}
