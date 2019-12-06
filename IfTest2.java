package day2;
public class IfTest2 {
	/*if(조건식1)
	 * 수행문장1:
	 * else if(조건식2)
	 * 수행문장2:
	 * else 
	 * 수행문장 ~
	 * */
	
	public static void main(String[] args) {

		int month = (int)(Math.random()*12)+1;
		if(month == 12 || month ==1|| month ==2)
		{
			System.out.println(month +"겨울");
		}
		//if(month == 3 || month ==4|| month ==5)
		else if( 3 <=month && month <= 5 )
		{
			System.out.println(month +"봄");
		}
		else if(month == 6 || month ==7|| month ==8)
		{
			System.out.println(month +"여름");
		}
		else 
		{
			System.out.println(month +"가을");
		}		
	}

}