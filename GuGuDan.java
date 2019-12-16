package day9;

class Multiplication {
	private int dan;
	private int number;
	Multiplication() {
		
	}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication{
	

	GuGuDanExpr() {
	}
	
	GuGuDanExpr(int dan) {
		super(dan);
	}
	
	GuGuDanExpr(int dan, int number){
		super(dan,number);
	}
	/*
	void printPart() {

		super.printPart();
	}
*/
	
	public static void printAll() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i +"*"+ j +"="+ i*j+" ");
			}
			System.out.println();
	}
	
}

}

public  class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int dan = (int)(Math.random()*20+1);
		int number = (int)(Math.random()*20+1);
		System.out.println(dan);
		System.out.println(number);
		
		if(dan>=1 && dan<=9 && number>=1 && number<=9) {
			
			GuGuDanExpr ggde = new GuGuDanExpr(dan,number);
			ggde.printPart();
		}
		else if(dan>=1 && dan<=9 && number>=10) {
			
			GuGuDanExpr ggde_onlyone = new GuGuDanExpr(dan);
			ggde_onlyone.printPart();
			System.out.print(dan + "단 : ");
		}
		
		else if(dan>=10 && number>=10) {
			/*
			GuGuDanExpr ggde_every = new GuGuDanExpr();
			ggde_every.printAll();
			 */
			GuGuDanExpr.printAll();  //static은 클래스명으로 접근한다. 
		}
		
		else {
			/*
			GuGuDanExpr ggde_every = new GuGuDanExpr();
			ggde_every.printAll();
			 */
			GuGuDanExpr.printAll();  //static은 클래스명으로 접근한다. 
			
		}
		
		
		}
		
	}
