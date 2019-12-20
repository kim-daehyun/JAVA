package day14;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

public class FileOutExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path);
		
	
		Date d = new Date();
		System.out.println(d.toString());
		
		String str1=d.toString();

		String.format(str1, args)
		
		String str2;
		String str3 = "김대현은 ";
		String str4 = "요일에 태어났습니다.";
		
		int day;
		
		
		
		GregorianCalendar gc = new GregorianCalendar();
	//	System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		gc = new GregorianCalendar(1993,8,18);
		day=gc.get(GregorianCalendar.DAY_OF_WEEK);
		
	
		
		if (!isDir.exists()) {
	        	isDir.mkdirs();
	        }
		 
		 try  {
	        	writer = new FileWriter("c:/iotest/outputTest.txt");
	            writer.write(str1);
	            writer.write("\r\n");   //\r\n 이 같이 와야한다. windows운영체제는 다르다 .
	            writer.write(str2);
	            writer.write("\r\n");   //\r\n 이 같이 와야한다. windows운영체제는 다르다 .
	            writer.write(str3);
	            writer.write(day);
	            writer.write(str4);//문자열만 출력하는 api
	            
	            //~~는 ~요일에 태어났음
	            
	            System.out.println("파일에 출력 완료!!");
	            
	            
	}catch (IOException ioe) {
        System.out.println("파일로 출력할 수 없습니다.");
    }finally {
        try {
        	if (writer != null)
        		writer.close();
        } catch (Exception e) {
        	System.out.println("파일을 닫는동안 오류 발생!!");
        }
    }

		 
		 
	}
		 
}
