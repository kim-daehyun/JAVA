package day5;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열 또는 컬렉션 객체의 데이터들을 꺼내서 반복처리하려는 경우 사용하는 반복문
//		앞에서 부터 차례대로 하나하나 꺼내서 처리하려는 경우
//		for(변수선언 : 배열 또는 컬렉션 객체)
//		반복문장 : 
/*		for(int data :score) 꺼내오고자 하는 데이터
* 			sum +=data;
* 
* 		for(int i=0;i<score.length;i++) 꺼내오고자 하는 데이터
* 			sum +=score[i];
* */
		
				int a1[]=new int[10];
				System.out.println(a1.length);
				int a2[]= {10,20,30};
				System.out.println(a2.length);
				
				for(int i=0; i<a1.length;i++) {
					System.out.print(a1[i]+" ");
				}
				System.out.println();
				for(int i:a1) {
					System.out.print(i+" ");
				}//read only, 배열의 내용을 다시 쓰는 것은 못함
				System.out.println();

				
				for(int i=0; i<a2.length;i++) {
					System.out.print(a2[i]+" ");
				}
				System.out.println();
				for(int i:a2) {
					System.out.print(a2+" ");
				}
				
				
				for(int i=0; i<a1.length;i++) {
					a1[i] = (i+1)*100;
				}
				for(int i=0; i<a1.length;i++) {
					System.out.print(a1[i]+" ");
				}
				System.out.println();
				for(int i:a1) {
					System.out.print(i+" ");
				}
				
				
//				a2[3]=100;
				
			}
	}


