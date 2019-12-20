package day14;
//ANSI는 네이티브 코드로 만들어짐
//ANSI로 생성된 것은 ANSI로, UTF8은 UTF8로 읽어야 한다. 
import java.io.*;
public class FileReaderTest3 {
    public static void main(String args[]) {
       try (FileReader reader = new FileReader("c:/iotest/output.txt");){
    	   int data;
    	   System.out.println(reader.getEncoding());
           while (true) {
               data = reader.read();
               if (data == -1)
                   break;               
               System.out.print((char)data);
           }
       } catch (FileNotFoundException fnfe) {
           System.out.println("파일이 존재하지 않습니다.");
       } catch (IOException ioe) {
           System.out.println("파일을 읽을 수 없습니다.");
       } 
    }
}


