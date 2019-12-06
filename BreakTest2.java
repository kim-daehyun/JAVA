package day4;
public class BreakTest2 {
	public static void main(String[] args) {
				
			Loop1:for(int dan=1;dan<=9; dan++){
					Loop2:for(int n=1; n<=9;n++){
						if(dan*n>30) {
							System.out.println();		
							break Loop1;
						}
						System.out.print(dan+"x"+n+"="+n*dan+"\t");							
					}
			System.out.println();
		}
				System.out.println("구구단 출력 종료");
	}
}
