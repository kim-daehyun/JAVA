package day4;
public class BreakTest1 {
	public static void main(String[] args) {
				
				boolean flag = false;
				for(int dan=1;dan<=9; dan++){
					for(int n=1; n<=9;n++){
						if(dan*n>30) {
							flag = true;
							break;
						}
						System.out.print(dan+"x"+n+"="+n*dan+"\t");							
					}
			//int dan = 1;
			System.out.println();
			if(flag==true)//if(flag) boolean형에 한에서 flag라는 변수명만 기재해도 됨
				break; 
		}
				System.out.println("구구단 출력 종료");
	}
}
