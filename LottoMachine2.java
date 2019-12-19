package day13;

import java.util.*;

public class LottoMachine2 {
		
		public static void main(String args[]) {
			int nums[] = new int[10];
			Random rd = new Random();
			
			for(int i=0; i<nums.length;i++) {
				nums[i]=rd.nextInt(21)+10;
			}
			
			HashSet<Integer> set = new HashSet<Integer>();

			/*while(set.size !=10)
			 * set.add(rand.nextInt(30)+1);
			 * */
			
		
			for(int i=0; i<nums.length;i++) {
				nums[i]=rd.nextInt(21)+10;
				set.add(nums[i]);
			}
		
		   
		//	System.out.println("저장된 데이터의 수 = " + set.size());
	        
			Iterator<Integer> iterator = set.iterator();
	        while (iterator.hasNext()) {  //hash의 사이즈가 10인지 확인ㄱ 
	        	iterator.next();         //다음원소가 있는지 없는지 확인하는 while문
	        }
	        System.out.printf("오늘의 로또번호 :");
	        System.out.println(set);
	    }
		

	}






