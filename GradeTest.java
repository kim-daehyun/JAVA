package weekend1;
import java.util.Scanner;
class GradeExpr{

	int jumsu[];
	GradeExpr(int jumsu[]){
		this.jumsu=jumsu;
	}
	
	double getAverage(){
		double sum = getTotal();
		return sum/jumsu.length;
	}
	
	double getTotal(){
		double sum=0; 
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
		}
		return sum;
	}
	
	int getGoodScore(){
		int max=jumsu[0];
		for(int i=1;i<jumsu.length;i++) {
			if(max<jumsu[i]) {
				max = jumsu[i];
			}
		}
	return max;
	}

	int getBadScore(){
		int min=jumsu[0];
		for(int i=1;i<jumsu.length;i++) {
			if(min>jumsu[i]) {
				min = jumsu[i];
			}
		}
	return min;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처리하고자 하는 숫자개수를 입력하세요 : ");
		int arrnum = sc.nextInt();
		int week[] = new int[arrnum];
		//int week[] = {100,20,50,203,534,1000};
		GradeExpr GE1 = new GradeExpr(week);
		System.out.print("점수들: ");
		for(int i=0;i<week.length;i++) {
			week[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<week.length;i++) {
			System.out.print(week[i]+(i!=week.length-1?",":" "));
		}
		System.out.println();
		System.out.println("총점: "+GE1.getTotal());
		System.out.println("평균: "+GE1.getAverage());
		System.out.println("최고 점수: "+GE1.getGoodScore());
		System.out.println("최저 점수: "+GE1.getBadScore());
	}

}
