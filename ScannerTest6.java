package day14;

import java.util.Scanner;
import java.io.File;
public class ScannerTest6 {
   public static void main(String[] args) throws Exception {	
      Scanner sc1 = new Scanner(new File("data.txt")); //상대경로를 의미
      //이클립스는 현재위치를 프로젝트 폴더로 인식한다. 
      //scanner 안쓰면 쪼개서 숫자로 변환해야 한다 하나하나씩
      //nextint를 사용하면 다음에 뭐가 있는지 확인하니까 훨씬 편하다ㅏ
      int cnt = 0;
      int totalSum = 0;     
      while (sc1.hasNextLine()) {
         String line = sc1.nextLine();
         Scanner sc2 = new Scanner(line).useDelimiter(" ");
	     int sum = 0;
  	     while(sc2.hasNextInt()) {
	        sum += sc2.nextInt();
	     }
	     System.out.println(line + ", sum = "+ sum);
	     totalSum += sum;
	     cnt++;
      }     
      System.out.println("Line: " + cnt + ", Total: " + totalSum);
      sc1.close();
   }
}

