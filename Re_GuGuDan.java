package weekend1;
class Multiplication {
	private int dan;
	private int number;
//	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++) {
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			}
				System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}
class GuGuDanExpr extends Multiplication{
//	public GuGuDanExpr() {	}
	GuGuDanExpr(int dan){
		super(dan);
	}
	GuGuDanExpr(int dan, int number){
		super(dan,number);	
	}
	public static void printAll() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d ",i,j,i*j);
		}
			System.out.println();
	}
}
}
public class Re_GuGuDan {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		System.out.println("dan :"+dan+", number :"+ number);
		if(dan >= 1 && dan <= 9 && number >= 1 && number <= 9 ) {
			GuGuDanExpr GGDE = new GuGuDanExpr(dan,number);
			System.out.printf("%d * %d = ", dan,number);
			GGDE.printPart();
		}
		
		else if(dan >= 1 && dan <= 9 && number >= 10) {
			System.out.printf("%d단 :",dan);
			GuGuDanExpr GGDE = new GuGuDanExpr(dan);
			GGDE.printPart();
		}
		else if(dan >= 10) {
			GuGuDanExpr.printAll();
		}
	}
}
