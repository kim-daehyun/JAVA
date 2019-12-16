package work;

abstract class Plane{
	
	private String planeName;
	private int fuelSize;

	public Plane(){
	}
	public Plane(String planeName, int fuelSize){
	
	this.planeName=planeName;
	this.fuelSize=fuelSize;
	
	}
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public abstract void flight(int distance);  //무조건 자손에서 선언해야됨
	
	public void refuel(int fuel) {
		//this.setFuelSize(this.getFuelSize()+fuel);
		//setFuelSize(getFuelSize()+fuel);
		fuelSize +=fuel;
	}
}

class Airplane extends Plane{
	public Airplane() {}
	public Airplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}
	public void flight(int distance) {
		
		//super.setFuelSize(super.getFuelSize() - 3*distance); 
		setFuelSize(getFuelSize() - 3*distance); 
		//1분 사용시 배터리 10감소 
	}
}

class Cargiplane extends Plane{
	public Cargiplane() {}
	public Cargiplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}
		public void flight(int distance) {
			setFuelSize(getFuelSize() - 5*distance); 
			//super.setFuelSize(super.getFuelSize() - 5*distance); 
		}
}

public class PlaneTest {
    public static void main(String args[]) {    	
    
    	// 2개의 원소를 갖는 plane타입의 배열객체를 생성
    	// Airplane과 Cargoplane 객체 생성하여 각각의 원소로 저장
    	   Plane pl[]  = new Plane[2];
    	   pl[0] = new Airplane("L747",1000);
    	   pl[1] = new Cargiplane("C40",1000);
    	 
    	// 생성된 객체의 정보 출력
    	printInfo(pl);
    	
    	// Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력
    	System.out.println("[100 운항]");
    	pl[0].flight(100);
    	pl[1].flight(100);
    	printInfo(pl);
    	
    	// Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
    	System.out.println("[200 주]");
    	pl[0].refuel(200);
    	pl[1].refuel(200);
    	printInfo(pl);
    }
    	public static void printInfo(Plane[] list) {
        // 타이틀 출력
        // Plane 객체들의 데이터 출력(출력 결과 참조)
    	System.out.println("Plane     fuelSize");
    	System.out.println("------------------");
		
    	
    	for(int i=0;i<list.length;i++) {
    		System.out.println(list[i].getPlaneName()+ "      "+list[i].getFuelSize());
    	}

	}
}


















