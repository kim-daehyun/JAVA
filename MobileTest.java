package mobile;
abstract class Mobile{  //직접 객체 생성을 하지 못한다 
	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize=batterySize;
		this.osType = osType;
	}
	public abstract void operate(int time);   //abstract 메서드는 정의만 바디 중괄호 nono
	public abstract void charge(int time);
	

	public String getMobileName() { 
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	
}
	class Ltab extends Mobile{
	
		public Ltab() {
		}
		
		public Ltab(String mobileName, int batterySize, String osType) {
			super(mobileName,batterySize,osType);
		}
		
		public void operate(int time) {
			
			setBatterySize(getBatterySize() - 10*time); 
				//1분 사용시 배터리 10감소 
		}
		public void charge(int time) {
			setBatterySize(getBatterySize() + 10*time); 
			
			//1분 사용시 배터리 10증가 		
		}
	

	}
		
	class Otab extends Mobile{
		
		public Otab() {
		}
		public Otab(String mobileName, int batterySize, String osType) {
			
			super(mobileName,batterySize,osType);
		}
		
		public void operate(int time) {
			//1분 사용시 배터리 12감소 
			setBatterySize(getBatterySize() - 12*time); 
		
		}
		public void charge(int time) {
			//1분 사용시 배터리 8증가 
			setBatterySize(getBatterySize() + 8*time); 
		}
	}



public class MobileTest {

	public static void main(String[] args) {
		// 각각의 Mobile 객체를 생성한다.
		Ltab LB = new Ltab("Ltab", 500, "ABC-01");  	  
		Otab OB = new Otab("Otab", 1000, "XYZ-20");
		// 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(LB);
		printMobile(OB);
		
		System.out.print("[10분 충전]\n");
		printTitle();
		// 각각의 Mobile 객체에 10분씩 충전을 한다.
		LB.charge(10);
		OB.charge(10);        
		// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
		printMobile(LB);
		printMobile(OB);
		
		System.out.print("[5분 통화]\n");
		printTitle();
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		LB.operate(5);
		OB.operate(5);		
		// 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
		printMobile(LB);
		printMobile(OB);
	}
	
	public static void printMobile(Mobile mobile) {
		System.out.printf("%s  %d  %s",mobile.getMobileName(),mobile.getBatterySize(),mobile.getOsType());
		System.out.println();
	}
	
	public static void printTitle() {
		System.out.println("Mobile Battery OS ");
		System.out.println("----------------------------");
	}
}
