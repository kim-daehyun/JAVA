package day13;

import java.util.*;
public class HashMapLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//keySet().iterator() : 키값만 추출
		/*
        HashMap<String, Integer> nation_pop = 
        		new HashMap<String, Integer>(5);
        Scanner sc = new Scanner(System.in);

        Set set = nation_pop.entrySet();
        Iterator it = set.iterator();
        
        set.contains(o)
       
        
        
        while(it.hasNext()) {
        	Map.Entry e = (Map.Entry)it.next();
        	
        }
        
        /*
        Set set = nation_pop.keyset();
        Set set = nation_pop.keyset();
        */
        
        
	}
}

/*
 * 표준입력으로 나라이름과 인구수를 입력받아
   HashMap 객체에 5개까지 저장한 후에 출력하고 종료한다.
      단, 입력되는 나라명은 모두 달라야 한다.
      
      - 실행

   나라이름을 입력하세요 : 
   인구 수를 입력하세요 : 
   저장되었습니다.
   
   나라이름을 입력하세요 : 
   인구 수를 입력하세요 : 
   나라명 xxx는 이미 저장되었습니다.
   
   이미 들어가있는 것을 확인하는 방법 찾아서ㄱㄱ  
   이미들어가 있으면 더이상 저장 안하게끔ㄱㄱ
   다섯개가 완성되면 다음과 같이 출력 
	:

   
  5개가 모두 입력되었습니다.
  입력된 데이터 : XX(nn), XX(nn)....

나라이름 key
인구수 value


 * */



