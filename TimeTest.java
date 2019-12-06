package day2;
public class TimeTest {
	public static void main(String[] args) {

		int time = 32150;
		int hr = 32150/3600;
		int min = (32150-(3600*hr))/60;
		int sec = 32150%60;
		System.out.println(hr+"시간"+min+"분"+sec+"초");
		
	}
	
}
