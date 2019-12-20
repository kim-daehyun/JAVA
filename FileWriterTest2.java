package day14;
import java.io.*;
public class FileWriterTest2 {
    public static void main(String args[]) {      
    	//다음과 같이 FileWriterTest와 다른점은 try-catch가
    	//끝나는 시점에서 close됨   이에 따로 finally 구문이 필요없다
        try (FileWriter  writer = new FileWriter("c:/iotest/output2.txt");){         
            char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write('\n');
            writer.write(arr);
            writer.write('\n');
            writer.write("OCJP 시험 대비!!");
            writer.write('\n');  
            System.out.println("파일에 출력 완료!!");
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        } 
    }
}
