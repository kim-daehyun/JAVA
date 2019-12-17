package day11.case3;
//~factory는 객체생성해주는 class로 이해하면됨
public class TVFactory {
	public static TV getTV(String beanName){
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
