package day4;
public class ArrayLab3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ary = new char[] {'J','a','v','a'};
		for(int i=0;i<ary.length;i++) {
		
			if(ary[i]>=90){
				ary[i]-=32;
			}
			else {
				ary[i]+=32;
			}
			/*
			 * if(arr[i]>='a'&&arr[i]<='z'){
			 * arr[i]-=32;
			 * }
			 *  else if(arr[i]>='A'&&arr[i]<='Z'){
			 * arr[i]+=32;
			 * }   다음 코드가 보다 더 유지보수성이 훌륭함
			 * 'A'-'a'로 표현하는 것도 방법임
			 * */  
		}		
		System.out.print("변환된 배열:");
		for(int i=0;i<ary.length-1;i++) {
			System.out.print(ary[i]+",");
		}
		System.out.println(ary[ary.length-1]);
	}
}

