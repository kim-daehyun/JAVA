package day8;
import day6.MethodLab3;
class SalaryExpr {
	int bonus;
	int grade;
	int salary;
	
	SalaryExpr() {
		bonus = 0;
		//this(0);
	}

	SalaryExpr(int bn) {
		bonus = bn;
//		this.bonus=bn;
	}

	public int getSalary(int grade) {
		//int showMeTheMoney = 0;
		if (grade == 1) {
			return bonus+salary + 100;
			//showMeTheMoney = bonus +100;
		} else if (grade == 2) {
			return bonus+salary + 90;
			//showMeTheMoney = bonus +90;
		} else if (grade == 3) {
			return bonus+salary + 80;
			//showMeTheMoney = bonus +80;
		} else {
			return bonus+salary + 70;
			//showMeTheMoney = bonus +70;
		}
//		return showMeTheMoney;
	}

}

public class SaleryExam {
	public static void main(String[] args) {

		int month = MethodLab3.getRandom(12); //getRandom은 static형이라서 객체생성안해도 자동으로 생성됨
		int grade = MethodLab3.getRandom(4);
		//SalaryExpr SE1;
		//SalaryExpr SE1 = null;   참조형 객체 초기화	하는 방법	
		if (month % 2 == 0) {
			SalaryExpr SE1 = new SalaryExpr(100);
			//SE1 = new SalaryExpr(100);
			System.out.printf("%d 월 %d 등급의 월급은 %d 입니다", month, grade, SE1.getSalary(grade));
			//출력은 한번만
		} else {
			SalaryExpr SE2 = new SalaryExpr();
			////SE1 = new SalaryExpr();
			
			System.out.printf("%d 월 %d 등급의 월급은 %d 입니다", month, grade, SE2.getSalary(grade));
		}
		//System.out.printf("%d 월 %d 등급의 월급은 %d 입니다", month, grade, SE1.getSalary(grade));

	}

}
