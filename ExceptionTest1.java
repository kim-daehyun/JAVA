/*[오류 처리] 
 * 컴파일 오류 : 구문오류, API사용 오류
 * 실행 오류 : 에러   - JVM영역에서 발생하는 오류로서 치명적이라 
 * 				  JVM이 프로그램 실행을 중단시키고 callstack 정보를 화면에 출력해줌
 * 				 미리 예측하고 대비하는 코드 작성불가		        
 * 			
 * 		       예외 - 자바 프로그램 영역에서 발생하는 실행오류로, 에러에 비하면
 * 				다소 가벼운 잘못된 상황
 * 				1) runtime 예외  - 발생원인이 프로그램 코드에 내제돼 있다 - 버그 -
 * 					(예외처리 선택 혹은 jvm이 대신 예외처리해줌) 
 * 				2) not-runtime 예외(일반 예외) - 발생원인이 외부적인 요인이다. 
 * 					(예외처리 필수)
 * 프로그램이 죽을때 그것에 대한 원인을 출력하는 구문구현 하기위해
 * 예외 처리 방법 
 * 1. 적극적인 예외 처리 
 * 	
 * 		try{
 * 				예외가 발생할 수도 있는 코드
 * 
 * 		}catch(처리해야 하는 예외 클래스의 변수선언){
 * 			에러가 났을시에 처리되는 코드
 * 		
 * 		}finally {
 * 			예외 발생 여부와 관계없이 마지막에 수행을 보장하는 코드
 * 			예외가 발생하든 안하든 실행됨
 * 		}
 * 
 * 2. 소극적인 예외 처리 
 * 		
 * 		메서드 헤더에 'throws 처리해야 하는 예외 클래스' 절을 추가
 * 
 * 		본인을 호출한 메서드를 다시  ㄱㄱ 예외를 던져라
 * 		-throw 발생시키고자하는 예외클래스의 객체 
 * 		throw new IOException(["예외메시지"])
 * 		예외를 발생시키는 코드를 가지고 있는 메서드는 헤더 throws 절을 사용해서 이 메서드는 
 * 		호출시 예외가 발생할 수도 있다는 것을 알려야 한다. 
 * 		
 * 		예외를 발생시킬때도 사용함	
 * */

package day11;
public class ExceptionTest1 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("수행시작");
		Thread.sleep(3000);
		System.out.println("수행시작");
	}

}
